package com.yanhang.cn;

public class Student {
    String no;
    String name;
    String type;
    char sex;
    int[] testScore = new int[15];
    int[] nums = new int[2];

    public Student() {
    }

    public Student(String no, String name, char sex, int[] testScore, String type) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.testScore = testScore;
        this.type = type;
    }

    public Student(String no, String name, char sex, int[] testScore, String type, int[] nums) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.testScore = testScore;
        this.type = type;
        this.nums = nums;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int[] getTestScore() {
        return testScore;
    }

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
