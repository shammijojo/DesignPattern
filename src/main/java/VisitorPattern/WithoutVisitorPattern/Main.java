package VisitorPattern.WithoutVisitorPattern;


/**
 * Suppose you were designing a Planet Explorers that routinely travel across the planets in the
 * Solar System to discover life form. However, the method of exploring is different on each planet,
 * due to the difference in atmosphere and surface composition.
 * Reference - https://medium.com/@darrenwedgwood/visitor-pattern-and-double-dispatch-part-1-e8d83426a0e7
 */
public class Main {

    public static void main(String[] args) {
        Planet mercury = new Mercury();
        Planet earth = new Earth();
        Explorer explorer = new ExplorerImpl();

        explorer.visit(mercury);
        explorer.visit(earth);
    }
}
