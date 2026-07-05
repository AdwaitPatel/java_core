package oop.oop5.abstractDemo;

public class Main {
    static void main(String[] args) {

        Son son = new Son(23);
//        son.career();
//        son.partner();
        son.normal();

        Daughter daughter = new Daughter(27);
//        daughter.career();
//        daughter.partner();

//        Parent mom = new Parent(23); // can't create objects of an abstract class
        Parent.hello();
    }
}
