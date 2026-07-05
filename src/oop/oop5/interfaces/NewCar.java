package oop.oop5.interfaces;

public class NewCar {

    private Engine engine;
    private MusicPlayer music = new CdPlayer();

    public NewCar() {
        this.engine = new PetrolEngine();
    }

    void upgradeCar() {
        this.engine = new ElectricEngine();
    }

    void startCar() {
        engine.start();
    }

    void accelerateCar() {
        engine.accelerate();
    }

    void stopCar() {
        engine.stop();
    }

    void startMusic() {
        System.out.println("Music Started");
    }

    void stopMusic() {
        System.out.println("Music stopped");
    }
}
