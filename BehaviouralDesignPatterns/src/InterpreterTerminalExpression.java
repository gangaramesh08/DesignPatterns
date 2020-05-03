public class InterpreterTerminalExpression implements InterpreterExpression {
    String data;

    public InterpreterTerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String expr) {
        return expr.contains(data);
    }
}
