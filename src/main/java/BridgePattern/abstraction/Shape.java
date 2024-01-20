package BridgePattern.abstraction;

import BridgePattern.implementation.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void drawColoredShape();

}
