package oop.oop5.interfaces;

// we can use multiclass inheritance here
public class Car implements Engine, Brake, MusicPlayer {

    int n = 34;

    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car Accelerated");
    }
}
