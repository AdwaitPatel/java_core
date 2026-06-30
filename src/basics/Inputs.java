package basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int rollNo = input.nextInt();
        System.out.println("Your roll no is " + rollNo);
    }
}
