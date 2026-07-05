package oop.oop5.interfaces;

public class Main {
    static void main(String[] args) {

//        Car car = new Car();
        Engine car = new Car();
//        System.out.println(car.n); // can't access n as it's not in Engine
//
//        car.start();
//        car.accelerate();
//        car.stop();

        // suppose I want to start MusicPlayer
//        car.start(); // this will start the car not the music

        NewCar car1 = new NewCar();

        car1.startCar();

        car1.upgradeCar();

        car1.startCar();
        car1.startMusic();

    }
}
