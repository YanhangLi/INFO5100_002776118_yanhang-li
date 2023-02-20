package com.yanhangli;

public class Triangle extends Shape {

    private float a;
    private float b;
    private float c;
    private float high;

    public Triangle(float a, float b, float c, float high) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.high = high;
    }

    @Override
    public void calculateArea() {
        System.out.println("Triangle area is: " + (a*high)/2);
    }

    @Override
    void calculatePerimeter() {

        if (a != b && b != c){
            System.out.println("The perimeter of an irregular triangle is: " + (a + b +c));
        }else if(a == c){
            System.out.println("The circumference of an isosceles triangle is: " + (2*a+b));
        }else{
            System.out.println("The perimeter of an equilateral triangle is: " + (3*a));
        }

    }
}