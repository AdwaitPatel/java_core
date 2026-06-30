package oop.oop3.polymorphism;

public class Circle extends Shape {
    // this will run the Object of circle is created
    // hence it's overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area of Circle : 3.14 * r * r");
    }
}
