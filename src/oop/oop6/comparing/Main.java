package oop.oop6.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static void main(String[] args) {

        Student adwait = new Student(7, 89.4f);
        Student kunal = new Student(56, 94.47f);
        Student mohit = new Student(16, 74.47f);
        Student chagan = new Student(5, 64.47f);

        Student[] list = {adwait, kunal, mohit, chagan};

//        Arrays.sort(list);
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });

        // lambda expression
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

        System.out.println(Arrays.toString(list));

        if (adwait.compareTo(kunal) < 0) {
            System.out.println(adwait.compareTo(kunal));
            System.out.println("Kunal has more marks");
        }

    }
}
