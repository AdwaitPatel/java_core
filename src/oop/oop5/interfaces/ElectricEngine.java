package oop.oop5.interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric Engine Car Started");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Car Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine Car Accelerated");
    }
}


