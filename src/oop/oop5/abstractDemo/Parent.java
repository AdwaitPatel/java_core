package oop.oop5.abstractDemo;

public abstract class Parent {

    int age;
    final int VALUE;
    
    public Parent(int age) {
        this.age = age;
        VALUE = 234234;
    }

    // we can't create abstract constructors
    // we can't create abstract static methods

    static void hello() {
        System.out.println("Hello from parent");
    }

    void normal() {
        System.out.println("This is a normal method");
    }

    // child classes must override these methods
    abstract void career();
    abstract void partner();

}
