package com.yanhangli;

import java.nio.channels.Pipe;

public class Circle extends Shape{

    private static double PI = 3.14;
    private float r;

    public Circle(float r){
        this.r = r;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the circle is: " + (r*r*PI));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The circumference of the circle is: " + (2*PI*r));
    }
}