public class InterpreterOrExpression implements InterpreterExpression {
    InterpreterExpression expression1;
    InterpreterExpression expression2;

    public InterpreterOrExpression(InterpreterExpression expression1, InterpreterExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String expr) {
        return expression1.interpret(expr) || expression2.interpret(expr);
    }
}
