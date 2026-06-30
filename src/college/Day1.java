package college;

import java.util.*;

//abstract class A {
//    abstract void m1();
//    abstract void m2();
//
//    public void m3() {};
//    // public void m1() {
//    //   System.out.println("class-a-m1");
//    // }
//
//    // public void m2() {
//    //   System.out.print("class-a-m2");
//    // }
//}
//
//class B extends A {
//    @Override
//    void m1() {
//        System.out.println("class-b-m1");
//    }
//    @Override
//    void m2() {
//        System.out.println("class-b-m2");
//    }
//    // @Override
//    // public void m1() {
//    //   System.out.println("class-b-m1");
//    // }
//}
//
//// now class is abstract it can or cannot implement methods from class A
//abstract class C extends A {
//    abstract void m4();
//
//    // public void m1() {
//    //   System.out.println("class-c-m1");
//    // }
//}
//
//class D extends C {
//    void m4() {};
//    void m2() {};
//    void m1() {};
//}
//
//public class Day1 {
//    public static void main(String[] args) {
//
//        // A a = new A();
//        // a.m1();
//        // B b = new B();
//        // b.m1();
//
//        // // Dynamic Method Dispacth
//        // // idhar b(child) ka method chalega
//        // // A aa = new B();
//        // A aa = new C();
//        // aa.m1();
//        // aa.m2(); // idhar A(parent) ka method chalega
//
//
//        // class A methods -> m1, m2, m3
////        A a = new B();
////        C a = new D();
////        a.m1();
//
//
//
//    }
//}

abstract class A {
    public static void m1() {
        System.out.println("class-a-m1");
    }
}

class B extends A {
    public static void m1() {
        System.out.println("class-b-m1");
    }
}

public class Day1 {
    public static void main(String[] args) {

        A a = new B();
        a.m1();


    }
}