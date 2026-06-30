package oop.oop2.singleton;

public class Singleton {
    // private methods/vars can only be access inside this class
    private Singleton() {}

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
