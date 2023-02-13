package com.yanhang.cn.pojo;

import java.util.Date;

public class Animal {
    int id;
    String name;
    String animalType;
    String color;
    String sex;
    double height;
    double weight;
    String likeFood;
    int sleep;
    Date birthday;

    public Animal(int id, String name, String animalType, String color, String sex, double height, double weight, String likeFood, int sleep, Date birthday) {
        this.id = id;
        this.name = name;
        this.animalType = animalType;
        this.color = color;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.likeFood = likeFood;
        this.sleep = sleep;
        this.birthday = birthday;

        System.out.println("id => " + id + " name =>" + name);
    }

    public void eat(){}

    public void play(){}

    public void sleep(){}

}
