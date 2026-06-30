package oop.oop3.polymorphism;

public class ObjectPrint {
    int n = 5;

    public ObjectPrint(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "n=" + n +
                '}';
    }

    static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj);


    }
}
