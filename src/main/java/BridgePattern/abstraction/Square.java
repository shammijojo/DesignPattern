package BridgePattern.abstraction;

import BridgePattern.implementation.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void drawColoredShape() {
        System.out.println("Drawing circle of "+color.fillColor());
    }
}
