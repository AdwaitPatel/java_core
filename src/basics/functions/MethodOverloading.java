package basics.functions;

public class MethodOverloading {
    static void main(String[] args) {
        // functions with same name can exist
        // but either no. of parameters or type of parameters should be different
        fun(45);
        fun("Adwait");
        fun(34, 54);
    }

    static void fun(int a) {
        System.out.println("First function " + a);
    }

    static void fun(String name) {
        System.out.println("Second function " + name);
    }

    static void fun(int a, int b) {
        System.out.println("Third function " + a + " " + b);
    }
}
