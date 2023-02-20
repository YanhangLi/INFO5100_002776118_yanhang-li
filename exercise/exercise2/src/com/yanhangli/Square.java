package com.yanhangli;

public class Square extends Shape {

    private float length;
    private float wide;

    public Square(float length, float wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    void calculateArea() {
        if (length != wide){
            System.out.println("The rectangular area is: " + length*wide);
        }else{
            System.out.println("The square area is: " + length*wide);
        }
    }

    @Override
    void calculatePerimeter() {
        if (length != wide){
            System.out.println("The circumference of the rectangle is: " + (length+wide)*2);
        }else{
            System.out.println("The perimeter of the square is: " + length*4);
        }
    }
}
