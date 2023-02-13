package com.yanhang.cn.pojo;

import java.util.Date;

public class Dog extends Animal {

    public Dog(int id, String name, String animalType, String color, String sex, double height, double weight, String likeFood, int sleep, Date birthday) {
        super(id, name, animalType, color, sex, height, weight, likeFood, sleep, birthday);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
