package basics.functions;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    static void main(String[] args) {
        System.out.println(x); // 90
        int x;
//        System.out.println(x); // we can use only when it's initialised
        x = 1;
        System.out.println(x); // 1
        fun();
    }

    static void fun() {
        System.out.println(x); // 90
    }
}
