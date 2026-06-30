package basics.functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String userName = sc.nextLine();
        System.out.println(personalGreet(userName));
    }

    static String personalGreet(String user) {
        String greeting = "how are you " + user;
        return greeting;
    }

    static String greet() {
        String greeting = "how are u?";
        return greeting;
    }
}
