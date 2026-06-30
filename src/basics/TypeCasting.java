package basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Implicit Type Casting => done by java internally only when :
        1. both types are compatible
            Ex. int -> double, float (possible ✅)
                string -> int (not possible ❌)
        2. destination type > source type
            Ex. int -> float, double (possible ✅)
                float, double -> int (not possible ❌)
        */
//        float n = input.nextInt(); // here int is converted to float implicitly
//        int n = input.nextFloat(); // this can't be done
//        System.out.println(n);

        // Explicit Type Casting => done by us explicitly
//        int num = (int)(45.943f);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        // here when we do arithmetic operations with byte it is promoted to int
//        int d = a * b / c;
//        System.out.println(d);

//        int number = 'A';
//        System.out.println(number); // ASCII Value of A = 65

        byte b = 45;
        char c = 'a';
        short s = 78;
        int i = 323;
        float f = 34.5f;
        double d = 0.234234;

        double result = (b * c) + (s + i) - (f / d);
        System.out.println((b * c) + " " + (s + i) + " " + (f / d));
        System.out.println(result);
        // here we can see that all data types got promoted to highest which is double

    }
}

