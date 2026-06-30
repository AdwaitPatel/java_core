package basics.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
        int ans = sum3(50, 20);
        System.out.println(ans);
    }

    // pass the values when calling the method
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;
        System.out.print("Enter first no. : ");
        a = sc.nextInt();
        System.out.print("Enter second no. : ");
        b = sc.nextInt();
        sum = a + b;
        return sum;  // return will terminate the function

//        System.out.println("Function ended, this line will not run");
    }

    // return nothing
    static void sum() {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;
        System.out.print("Enter first no. : ");
        a = sc.nextInt();
        System.out.print("Enter second no. : ");
        b = sc.nextInt();
        sum = a + b;

        System.out.println("Sum is : " + sum);
    }

    /*
    Simple function syntax
    return_type function_name(arguments) {
        // body
    }
    */
}
