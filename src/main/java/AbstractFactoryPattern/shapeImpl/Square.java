package AbstractFactoryPattern.shapeImpl;


import AbstractFactoryPattern.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing normal square...");
    }
}
