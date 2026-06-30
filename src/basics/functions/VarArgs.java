package basics.functions;

import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
        variableArguments(2, 34, 45, 2334, 35345, 234, 23333);
        multipleType(3, 5, "adwait", "shashu", "pillu");
    }

    static void multipleType(int a, int b, String ...v) {
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }

    // variable arguments are stored in an array
    static void variableArguments(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
