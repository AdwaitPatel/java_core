package basics.functions;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        swap(a, b); // this won't swap a and b
        System.out.println(a + " " + b);

        /*
        While passing argument to functions :
        1. Primitives(int, char, float etc) -> Only the copy is passed
        2. Objects(String, Array etc) -> data with reference is passed

        # If modification is done :
        in primitives => won't change the original data
        in objects => original data will be changed
         */

        int[] arr = {1, 23, 34, 5};
        changeArr(arr); // update will happen
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void changeArr(int[] nums) {
        nums[0] = 999;
    }


}
