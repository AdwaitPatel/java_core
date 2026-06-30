package oop.oop1;

public class WrapperExamples {
    static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        swap(a, b);
//        System.out.println(a + " " + b); // still not swapped -> why?
        // Because Integer class is final class

        /*
        FINAL KEYWORD :
        1. Primitive data types
        - we can't update/modify after the initialization if we use "final" keyword
        2. Non-Primitives
        - we can modify the object but can't reassign it
        */

        // Primitive final keyword example
//        final int n = 34;
//        n = 23; // can't be updated

        // Non-Primitive final keyword example
        final A student = new A("Adwait");
        // modification is allowed
        student.name = "Other name";
        // can't re-assign the same object
//        student = new A("Kunal");

        A obj = new A("Adwait");
        System.out.println(obj); // this will give me an hexcode

//        for (int i = 0; i < 1000000; i++) {
//            // this will create multiple new objects and
//            // obj will point to new object everytime and
//            // the objects which are not pointed by any
//            // variable will be removed by garbage collector
//            obj = new A("Random Name");
//        }

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    String name;

     A(String name) {
        this.name = name;
    }

    // finalize -> when garbage collector is about
    // to delete this object we can perform some stuff
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}