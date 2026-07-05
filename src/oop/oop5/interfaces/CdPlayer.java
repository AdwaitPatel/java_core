package oop.oop5.interfaces;

public class CdPlayer implements MusicPlayer {
    @Override
    public void start() {
        System.out.println("Music Started");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopped");
    }
}
