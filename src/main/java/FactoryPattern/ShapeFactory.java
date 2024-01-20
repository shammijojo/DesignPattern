package FactoryPattern;

public class ShapeFactory {

    Shape getShape(String shape) {
        switch (shape) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
        }
        throw new IllegalArgumentException("Invalid shape");
    }

}
