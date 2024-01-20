package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.Shape;
import AbstractFactoryPattern.shapeImpl.Rectangle;
import AbstractFactoryPattern.shapeImpl.Square;


public class NormalShapeFactory extends AbstractShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals("SQUARE")) {
            return new Square();
        } else if(shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        }
        throw new IllegalArgumentException("Invalid shape type");
    }
}
