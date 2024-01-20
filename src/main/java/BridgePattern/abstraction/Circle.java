package BridgePattern.abstraction;

import BridgePattern.implementation.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void drawColoredShape() {
        System.out.println("Drawing circle of "+color.fillColor());
    }
}
