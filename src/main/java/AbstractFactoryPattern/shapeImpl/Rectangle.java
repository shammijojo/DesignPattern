package AbstractFactoryPattern.shapeImpl;


import AbstractFactoryPattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing normal rectangle...");
    }
}
