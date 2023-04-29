package com.yanhangli;

public class Rectangle extends Shape {

    public Rectangle() {
    }

    public Rectangle(float wide, float high) {
        super(wide, high);
    }

    @Override
    public void calculateArea() {
        System.out.println("The rectangular area is: " + super.getWide() * super.getHigh());
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of the rectangle is: " + (super.getWide() + super.getHigh())*2);
    }
}
