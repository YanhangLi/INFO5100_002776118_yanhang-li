package com.yanhangli;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3, 2);
        triangle.calculateArea();
        triangle.calculatePerimeter();

        Rectangle rectangle = new Rectangle(1 ,2);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Circle circle = new Circle(10);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square(2, 2);
        square.calculateArea();
        square.calculatePerimeter();
    }
}
