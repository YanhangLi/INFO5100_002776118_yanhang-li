package com.yanhang.cn.pojo;

public class Association extends Computer {

    public Association(int id, String name, String cpuType, float accelerationFrequency, float screenSize, String resolvingPower, int duration, int m2NumberInterfaces) {
        super(id, name, cpuType, accelerationFrequency, screenSize, resolvingPower, duration, m2NumberInterfaces);
    }

    @Override
    public void powerOn() {
        super.powerOn();
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

    @Override
    public void restart() {
        super.restart();
    }
}
