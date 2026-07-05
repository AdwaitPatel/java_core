package oop.oop5.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("Daughter wanna be a Coder");
    }

    @Override
    void partner() {
        System.out.println("Daughter's partner is abc");
    }
}
