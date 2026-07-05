package oop.oop6;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

//        list.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);

//        list.forEach(fun);

        Operation add = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;

        LambdaFunctions cal = new LambdaFunctions();

        System.out.println(cal.operate(2, 5, add));
        System.out.println(cal.operate(2, 5, sub));
        System.out.println(cal.operate(2, 5, mul));


    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

@FunctionalInterface
interface Operation {
    int operation(int a, int b);
}
