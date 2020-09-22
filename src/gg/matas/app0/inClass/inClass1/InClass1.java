package gg.matas.app0.inClass.inClass1;

public class InClass1 {
    public static void main(String[] args) {
        Dog dog0 = new Dog();
        dog0.setName("bugis");
        dog0.setVeisle("labradoras");
        System.out.println(dog0.getName() + " " + dog0.getVeisle());
        Dog dog1 = new Dog("baitas", "terjeras");
        System.out.println(dog1.getName() + " " + dog1.getVeisle());
    }
}
