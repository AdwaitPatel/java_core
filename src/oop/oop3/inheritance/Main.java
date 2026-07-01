package oop.oop3.inheritance;

public class Main {
    static void main(String[] args) {
//        Box a = new Box(); // constructor with 0 args
//        Box a = new Box(45); // cube constructor
//        Box a = new Box(45, 34, 23); // cuboid constructor
//        Box b = new Box(a);
//        System.out.println(a.l + " " + a.w + " " + a.h);
//        System.out.println(b.l + " " + b.w + " " + b.h);

//        BoxWeight a = new BoxWeight();
//        BoxWeight b = new BoxWeight(12, 34, 39, 44);
//        // can't access length as it's private
//        System.out.println(a.weight);
//        System.out.println(b.w + " " + b.h + " " + b.weight);

        // here we'll have the properties of the reference variable object only
//        Box a = new BoxWeight(2, 4, 5, 8);
//        System.out.println(a.w + " " + a.h); // these are parent(Box) class properties only
//        System.out.println(a.weight); // can't access child(BoxWeight) class properties from a parent class

//        BoxWeight b = new Box(1, 3, 5);
        // here Box is parent class and BoxWeight is child class
        // we can't create a parent class object and reference it with child class object
        // because Box(parent) class doesn't have the properties of BoxWeight(child) class



//        BoxPrice a = new BoxPrice(2, 3, 4, 6, 89);
//        BoxPrice b = new BoxPrice(12, 10,99);


        Box box = new Box();
//        box.greet();
//        Box.greet(); // always use class for static methods as static don't depend upon objects


//        Box box2 = new BoxWeight();
//        box2.greet(); // we can inherit but can't override static methods

        









    }
}
