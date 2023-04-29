package com.yanhang.cn;

public class PartTime extends Student {
    String no;
    String name;
    String type;
    char sex;
    int[] testScore = new int[15];

    public PartTime(String no, String name, char sex,String type, int[] testScore) {
        super(no, name, sex, testScore, type);
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.testScore = testScore;
        this.type = type;
    }

    @Override
    public String getNo() {
        return no;
    }

    @Override
    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public char getSex() {
        return sex;
    }

    @Override
    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public int[] getTestScore() {
        return testScore;
    }

    @Override
    public void setTestScore(int[] testScore) {
        this.testScore = testScore;
    }
}
