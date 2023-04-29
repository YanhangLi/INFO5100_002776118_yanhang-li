package com.yanhang.cn.pojo;

public class Food {
    int id;
    String name;
    String itemNo;
    int netContent;
    int quality;
    String ProductionNumber;
    String standardNumber;
    String placeOfOrigin;

    public Food(int id, String name, String itemNo, int netContent, int quality, String productionNumber, String standardNumber, String placeOfOrigin) {
        this.id = id;
        this.name = name;
        this.itemNo = itemNo;
        this.netContent = netContent;
        this.quality = quality;
        ProductionNumber = productionNumber;
        this.standardNumber = standardNumber;
        this.placeOfOrigin = placeOfOrigin;

        System.out.println("id => " + id + " name => " + name);
    }

    public void stock(){}

    public boolean isOverdue(){ return false;}

    public void discount(){}

}
