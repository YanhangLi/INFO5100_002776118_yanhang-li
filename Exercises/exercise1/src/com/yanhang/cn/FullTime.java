package com.yanhang.cn;

public class FullTime extends Student{
    String no;
    String name;
    char sex;
    String type;
    int[] testScore = new int[15];
    int[] nums = new int[2];

    public FullTime(){}

    public FullTime(String no, String name, char sex, int[] testScore,String type, int[] nums) {
        super(no, name, sex, testScore, type, nums);
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.testScore = testScore;
        this.nums = nums;
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
    public char getSex() {
        return sex;
    }

    @Override
    public void setSex(char sex) {
        this.sex = sex;
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
    public int[] getTestScore() {
        return testScore;
    }

    @Override
    public void setTestScore(int[] testScore) {
        this.testScore = testScore;
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }
}
