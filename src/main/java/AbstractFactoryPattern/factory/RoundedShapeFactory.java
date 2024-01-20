package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.Shape;
import AbstractFactoryPattern.shapeImpl.RoundedRectangle;
import AbstractFactoryPattern.shapeImpl.RoundedSquare;


public class RoundedShapeFactory extends AbstractShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals("SQUARE")) {
            return new RoundedSquare();
        } else if(shapeType.equals("RECTANGLE")) {
            return new RoundedRectangle();
        }
        throw new IllegalArgumentException("Invalid shape type");
    }
}
