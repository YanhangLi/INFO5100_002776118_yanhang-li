package com.yanhang.cn.pojo;

public class Colthes {
    int id;
    String name;
    String articleNo;
    String productName;
    String color;
    String fabricComposition;
    String fabricCharacteristics;
    String thickness;


    public Colthes(int id, String name, String articleNo, String productName, String color, String fabricComposition, String fabricCharacteristics, String thickness) {
        this.id = id;
        this.name = name;
        this.articleNo = articleNo;
        this.productName = productName;
        this.color = color;
        this.fabricComposition = fabricComposition;
        this.fabricCharacteristics = fabricCharacteristics;
        this.thickness = thickness;

        System.out.println("id => " + id + " name =>" + name);
    }

    public void dress(){}

    public void disrobe(){}

    public void destroy(){}
}
