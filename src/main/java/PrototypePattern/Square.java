package PrototypePattern;

public class Square implements Shape{
    private String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Square(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Square of color " + this.color);
    }
}
