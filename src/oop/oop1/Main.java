package oop.oop1;

public class Main {
    static void main(String[] args) {
        // suppose you have to store student data like
        // each student will have rno, name, marks
        // for that we can make a Student class with these properties

        // Class_name ref_variable = new Constructor();
        Student student1 = new Student();
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        Student student2 = new Student(7, "Adwait", 78.7f);
        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        // this will reference the same object
        Student student3 = student2;
        System.out.println(student3.name);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    // constructor -> a special function which is called when a new object is created
    Student() {
        // this references to the object ex. this.rno means student1.rno
//        this.rno = 101;
//        this.name = "Random Name";
//        this.marks = 0.0f;

        // we can call another constructor from a constructor with "this"
        this(101, "random name", 34.5f);
    }

    // method/function/constructor overloading is happening
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
