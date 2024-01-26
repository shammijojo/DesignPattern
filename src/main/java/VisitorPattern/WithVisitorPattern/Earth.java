package VisitorPattern.WithVisitorPattern;

public class Earth implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
