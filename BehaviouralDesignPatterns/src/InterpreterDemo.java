public class InterpreterDemo {
    public static void main(String[] args) {
        InterpreterExpression expression1 = new InterpreterTerminalExpression("9");
        InterpreterExpression expression2 = new InterpreterTerminalExpression("8");
        InterpreterExpression expression3 = new InterpreterOrExpression(expression1, expression2);

        System.out.println(expression1.interpret("9"));
        System.out.println(expression2.interpret("8"));
        System.out.println(expression3.interpret("7"));

    }
}
