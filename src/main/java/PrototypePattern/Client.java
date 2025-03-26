package PrototypePattern;

public class Client {

    public static void main(String[] args) {
        Shape shape = new Circle("RED");
        Shape clone = shape.clone();
        shape.draw();
        clone.draw();
    }
}
