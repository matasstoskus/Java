package gg.matas.app0.inClass.inClass1;

class Dog {
    public String name;
    public String veisle;

    public String getName() {
        return this.name;
    }

    public String getVeisle() {
        return this.veisle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVeisle(String veisle) {
        this.veisle = veisle;
    }

    public Dog(String n, String v) {
        this.name = n;
        this.veisle = v;
    }

    public Dog() {
    }
}

