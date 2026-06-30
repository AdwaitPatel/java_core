package oop.oop2.singleton;

public class Main {
    static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // here only obj1 will be created and obj2 and obj3 will use obj1

    }
}
