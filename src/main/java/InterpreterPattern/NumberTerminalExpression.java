package InterpreterPattern;

public class NumberTerminalExpression implements AbstractExpression {

    private String variable;

    public NumberTerminalExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Context context) {
        return context.get(variable);
    }
}
