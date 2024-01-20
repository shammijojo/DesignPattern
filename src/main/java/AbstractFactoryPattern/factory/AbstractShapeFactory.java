package AbstractFactoryPattern.factory;


import AbstractFactoryPattern.Shape;

public abstract class AbstractShapeFactory {

    public abstract Shape getShape(String shapeType);
}
