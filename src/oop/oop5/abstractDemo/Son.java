package oop.oop5.abstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("Son wanna be a artist");
    }

    @Override
    void partner() {
        System.out.println("Son's partner is xyz");
    }
}
