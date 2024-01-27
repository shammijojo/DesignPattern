package InterpreterPattern;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.add("a", 10);
        context.add("b", 20);
        context.add("c", 30);

        AbstractExpression result = new AdditionNonTerminalExpression(new NumberTerminalExpression("a"),
                new NumberTerminalExpression("b"));
        System.out.println(result.interpret(context));

        result = new AdditionNonTerminalExpression(new AdditionNonTerminalExpression(new NumberTerminalExpression("a"),new NumberTerminalExpression("b")),
                new NumberTerminalExpression("c"));
        System.out.println(result.interpret(context));

    }

}
