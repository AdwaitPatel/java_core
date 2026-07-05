package oop.oop5.interfaces;

public class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol Engine Car Started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine Car Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Petrol Engine Car Accelerated");
    }
}


