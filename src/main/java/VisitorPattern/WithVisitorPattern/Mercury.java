package VisitorPattern.WithVisitorPattern;

public class Mercury implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
