package oop.oop5.interfaces;

public interface Engine {

    // interface variable are by default public static final
     public static final int PRICE = 25000;

    // interface methods are abstract by default
    abstract void start();
    void stop();
    void accelerate();

}
