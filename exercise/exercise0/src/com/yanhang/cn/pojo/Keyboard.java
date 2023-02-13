package com.yanhang.cn.pojo;

public class Keyboard {
    int id;
    String name;
    int keyNumber;
    String connectionMode;
    String shaftType;
    String backLightEffect;
    String color;
    String powerSupplyMode;

    public Keyboard(int id, String name, int keyNumber, String connectionMode, String shaftType, String backLightEffect, String color, String powerSupplyMode) {
        this.id = id;
        this.name = name;
        this.keyNumber = keyNumber;
        this.connectionMode = connectionMode;
        this.shaftType = shaftType;
        this.backLightEffect = backLightEffect;
        this.color = color;
        this.powerSupplyMode = powerSupplyMode;

        System.out.println("id => " + id + " name =>" + name);
    }

    public void connectingComputer(){}

    public void charge(){}

    public void knock(){}
}
