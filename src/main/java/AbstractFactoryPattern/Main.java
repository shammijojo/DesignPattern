package AbstractFactoryPattern;

import AbstractFactoryPattern.factory.AbstractShapeFactory;
import AbstractFactoryPattern.factory.FactoryGenerator;

public class Main {

    private static final String RECTANGLE = "RECTANGLE";
    private static final String SQUARE = "SQUARE";

    public static void main(String[] args) {
        AbstractShapeFactory shapeFactory = new FactoryGenerator().getFactory(true);
        Shape shape = shapeFactory.getShape(RECTANGLE);
        shape.draw();
        shape = shapeFactory.getShape(SQUARE);
        shape.draw();

        shapeFactory = new FactoryGenerator().getFactory(false);
        shape = shapeFactory.getShape(RECTANGLE);
        shape.draw();
        shape = shapeFactory.getShape(SQUARE);
        shape.draw();
    }

}
