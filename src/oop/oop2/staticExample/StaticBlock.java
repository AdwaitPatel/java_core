package oop.oop2.staticExample;

// example of initialization of static variable
public class StaticBlock {
    static int a = 12;
    static int b;

    // this static block will run only once when first object is created
    // i.e. when then class is loaded
    static {
        System.out.println("This is a Static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
