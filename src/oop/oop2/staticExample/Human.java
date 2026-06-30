package oop.oop2.staticExample;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    // here static keyword is used - why?
    // because this "property doesn't depend on object" it' same for every object
    static long population;

    static void message() {
        System.out.println("Hello people");
//        System.out.println(this.age); static method can't access non-static stuff
    }

    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        // here convention is to use class name but
//        this.population += 1; will also work, but it will first look
        // inside the constructor then in the class. But Class_name will directly used
        Human.population += 1;
    }
}
