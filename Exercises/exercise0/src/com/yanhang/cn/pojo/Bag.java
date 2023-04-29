package com.yanhang.cn.pojo;

import java.util.Date;

public class Bag {
    int id;
    int sales;
    String name;
    String color;
    String bagType;
    Date productionTime;
    double size;
    double price;

    public Bag(int id, int sales, String name, String color, String bagType, Date productionTime, double size, double price) {
        this.id = id;
        this.sales = sales;
        this.name = name;
        this.color = color;
        this.bagType = bagType;
        this.productionTime = productionTime;
        this.size = size;
        this.price = price;

        System.out.println("id => " + id + " name => " + name);
    }

    public void put(){}

    public void get(){}

    public void buy(){}

}
