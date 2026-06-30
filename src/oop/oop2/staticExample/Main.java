package oop.oop2.staticExample;

public class Main {
    // why main method is static?
    // it is static because the JVM needs to start the
    // program without creating an object of the class.
    // Static methods belong to the class, so the JVM can call main() directly.
    static void main(String[] args) {
//        Human adwait = new Human("Adwait", 21, 100, false);
//        Human rahul = new Human("Rahul", 29, 10000, true);
//        Human arpit = new Human("Arpit", 29, 10000, true);

        // don't access static properties with reference variable use class instead
//        System.out.println(adwait.population);
        // static properties can be accessed without creating objects
        // because they are not dependent on the objects
//        System.out.println(Human.population);

        // we can't access non-static data from a static
//        greet();

        // to access a non-static data we need to create its object first
        Main obj = new Main();
        obj.greet();
    }

    void greet() {
        System.out.println("Hello people");
    }
}
