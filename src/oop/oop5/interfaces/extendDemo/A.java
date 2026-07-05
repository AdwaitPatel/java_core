package oop.oop5.interfaces.extendDemo;

//public interface A {
//    static void greeting() {
//        System.out.println("Hello from A");
//    }
//    default void hello() {
//        System.out.println("Hello");
//    }
//}

public class A {
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class C implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
