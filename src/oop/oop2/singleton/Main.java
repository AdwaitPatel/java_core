package oop.oop2.singleton;

import oop.oop4.access.A;

public class Main {
    static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // here only obj1 will be created and obj2 and obj3 will use obj1

        A a = new A(55, "Rakul");
        System.out.println(a.getNum());
//        int n = a.num; // this is outside the package not allowed

    }
}
