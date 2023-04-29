package com.yanhang.cn.pojo;

public class Computer {
    int id;
    String name;
    String cpuType;
    float accelerationFrequency;
    float screenSize;
    String resolvingPower;
    int duration;
    int m2NumberInterfaces;

    public Computer(int id, String name, String cpuType, float accelerationFrequency, float screenSize, String resolvingPower, int duration, int m2NumberInterfaces) {
        this.id = id;
        this.name = name;
        this.cpuType = cpuType;
        this.accelerationFrequency = accelerationFrequency;
        this.screenSize = screenSize;
        this.resolvingPower = resolvingPower;
        this.duration = duration;
        this.m2NumberInterfaces = m2NumberInterfaces;

        System.out.println("id => " + id + " name =>" + name);
    }

    public void powerOn(){}

    public void shutdown(){}

    public void restart(){}
}
