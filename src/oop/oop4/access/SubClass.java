package oop.oop4.access;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    static void main(String[] args) {
        SubClass obj = new SubClass(21, "adp");
        int n = obj.getNum();
        System.out.println(n);
    }
}
