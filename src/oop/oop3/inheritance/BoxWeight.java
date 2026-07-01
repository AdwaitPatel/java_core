package oop.oop3.inheritance;

public class BoxWeight extends Box {

    int weight;

    // static methods
//    @Override
//    static void greet() {
//        System.out.println("Hello from BoxWeight Class!!");
//    }

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (int side, int weight) {
        super(side);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h); // super() is used to call the constructor
        // of the parent class from constructor of child class
        this.weight = weight;

        System.out.println(super.w);
        System.out.println(super.h);
    }




}
