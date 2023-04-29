package com.yanhang.cn.pojo;

public class Car {
    int id;
    String name;
    String engine;
    double height;
    double width;
    double wheelbase;
    double trackWidth;
    double maximumSpeed;

    public Car(int id, String name, String engine, double height, double width, double wheelbase, double trackWidth, double maximumSpeed) {
        this.id = id;
        this.name = name;
        this.engine = engine;
        this.height = height;
        this.width = width;
        this.wheelbase = wheelbase;
        this.trackWidth = trackWidth;
        this.maximumSpeed = maximumSpeed;

        System.out.println("id => " + id + " name =>" + name);
    }

    public void start(){}

    public void accelerate(){}

    public void eceleration(){}
}
