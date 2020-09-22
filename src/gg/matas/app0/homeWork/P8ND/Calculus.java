package gg.matas.app0.homeWork.P8ND;

public class Calculus {
    public static void main(String[] args) {
        StaticCalculator sc = new StaticCalculator();
        NonstaticCalculator nsc = new NonstaticCalculator();
        System.out.println(sc.add(5, 4));
        System.out.println(sc.sub(5, 4));
        System.out.println(sc.mul(5, 4));
        System.out.println(sc.div(5, 4));
        System.out.println(nsc.add(5, 4));
        System.out.println(nsc.sub(5, 4));
        System.out.println(nsc.mul(5, 4));
        System.out.println(nsc.div(5, 4));
    }
}

class StaticCalculator {
    public static double add(double i, double j) {
        return i + j;
    }

    public static double sub(double i, double j) {
        return i - j;
    }

    public static double mul(double i, double j) {
        return i * j;
    }

    public static double div(double i, double j) {
        return i / j;
    }
}

class NonstaticCalculator {
    public double add(double i, double j) {
        return i + j;
    }

    public double sub(double i, double j) {
        return i - j;
    }

    public double mul(double i, double j) {
        return i * j;
    }

    public double div(double i, double j) {
        return i / j;
    }
}