package VisitorPattern.WithoutVisitorPattern;

public class ExplorerImpl implements Explorer{
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Landed on mercury");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Landed on earth");
    }

    @Override
    public void visit(Planet planet) {
        System.out.println("Landed on unknown planet");
    }
}
