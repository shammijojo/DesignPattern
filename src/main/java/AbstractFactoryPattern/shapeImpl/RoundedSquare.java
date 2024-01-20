package AbstractFactoryPattern.shapeImpl;


import AbstractFactoryPattern.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rounded rectangle...");
    }
}
