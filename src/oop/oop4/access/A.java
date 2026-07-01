package oop.oop4.access;

public class A {
    int num; // no access modifier
//    public int num;
//    private int num;
//    protected int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
