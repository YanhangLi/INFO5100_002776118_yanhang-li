package com.yanhangli;

public abstract class Shape {
    private float wide;
    private float high;

    public Shape() {
    }

    public Shape(float wide, float high) {
        this.wide = wide;
        this.high = high;
    }

    public float getWide() {
        return wide;
    }

    public void setWide(float wide) {
        this.wide = wide;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    abstract void calculateArea();

    abstract void calculatePerimeter();
}
