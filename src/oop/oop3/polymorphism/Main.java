package oop.oop3.polymorphism;

public class Main {
    static void main(String[] args) {
        Shape shape = new Shape();
        Square square = new Square();

        // Parent obj = new Child();
        Shape circle = new Circle();
        circle.area();
    }
}
