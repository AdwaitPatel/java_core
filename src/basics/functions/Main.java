package basics.functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;
        System.out.print("Enter first no. : ");
        a = sc.nextInt();
        System.out.print("Enter second no. : ");
        b = sc.nextInt();
        sum = a + b;

        System.out.println("Sum is : " + sum);

        // now suppose you have to do this 100 times will you copy and paste
        // the same code again and agin? No, because in programming we have to
        // follow DRY(Don't Repeat Yourself) Principle
        // So, we use functions/methods in java
        // Any function written inside a class is called as "Method"
    }
}
