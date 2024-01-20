package BridgePattern;


import BridgePattern.abstraction.Circle;
import BridgePattern.abstraction.Shape;
import BridgePattern.abstraction.Square;
import BridgePattern.implementation.BlueColor;
import BridgePattern.implementation.RedColor;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Circle(new BlueColor());
        shape.drawColoredShape();

        shape = new Square(new RedColor());
        shape.drawColoredShape();
    }
}
