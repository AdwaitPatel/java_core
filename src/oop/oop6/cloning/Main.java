package oop.oop6.cloning;

import java.util.Arrays;

public class Main {
    static void main(String[] args) throws CloneNotSupportedException {

        Human adwait = new Human(21, "Adwait");

//        Human adwaitClone = new Human(adwait); // this takes a lot of processing time because of new keyword
        // instead use Clonable interface with class human to make clones faster


        Human twin = (Human) adwait.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.data));

        twin.data[0] = 99;  // it will change the original too as it's shallow copy

        System.out.println(Arrays.toString(twin.data));
        System.out.println(Arrays.toString(adwait.data)); // no change for deep copy




    }
}
