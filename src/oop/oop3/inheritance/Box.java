package oop.oop3.inheritance;

public class Box {
    private int l;
    int w;
    int h;

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    Box (int side) {
//        super(); //it'll call the superclass which is Object class
        this.l = side;
        this.w = side;
        this.h = side;
    }

    // cuboid
    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box oldbox) {
        this.l = oldbox.l;
        this.w = oldbox.w;
        this.h = oldbox.h;
    }

    public void displayInfo() {
        System.out.println("Box class");
    }
}
