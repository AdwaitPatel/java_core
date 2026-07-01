package oop.oop4.access;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        A a = new A(23, "Adwait" );
        System.out.println(a.getNum());
        int n = a.num;
        // no access modifier on num means it can be accessed anywhere inside this package only



        // we can't directly get the reference of arraylist as it's private
//        ArrayList<Integer> list = new ArrayList<>(45);
//        System.out.println(list.DEFAULT_CAPACITY);

    }
}
