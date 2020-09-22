package gg.matas.app0.homeWork.P7ND;

public class Comp {
    public static void main(String[] args) {
        Computer mac = new Computer(new CPU("2ghz","8mb"), new GPU("1400mhz","8gb"));
        System.out.println(mac);
    }
}

class Computer {
    CPU cpu;
    GPU gpu;

    public Computer (){}

    public Computer(CPU CPU, GPU GPU) {
        this.cpu = CPU;
        this.gpu = GPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                '}';
    }
}

class CPU {
    String baseClock;
    String cachePerCore;

    public CPU () {}

    public CPU(String baseClock, String cachePerCore) {
        this.baseClock = baseClock;
        this.cachePerCore = cachePerCore;
    }

    public String getBaseClock() {
        return baseClock;
    }

    public void setBaseClock(String baseClock) {
        this.baseClock = baseClock;
    }

    public String getCachePerCore() {
        return cachePerCore;
    }

    public void setCachePerCore(String cachePerCore) {
        this.cachePerCore = cachePerCore;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "baseClock=" + baseClock +
                ", cachePerCore=" + cachePerCore +
                '}';
    }
}

class GPU {
    String baceClock;
    String memory;

    public GPU (){}

    public GPU(String baceClock, String memory) {
        this.baceClock = baceClock;
        this.memory = memory;
    }

    public String getBaceClock() {
        return baceClock;
    }

    public void setBaceClock(String baceClock) {
        this.baceClock = baceClock;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "baceClock=" + baceClock +
                ", memory=" + memory +
                '}';
    }
}

