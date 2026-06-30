package basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter something : ");
        Scanner input = new Scanner(System.in);
        // here System.in means we are taking input from keyboard

        System.out.println("Output : " + input.nextLine());
    }
}