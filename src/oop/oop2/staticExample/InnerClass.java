package oop.oop2.staticExample;

public class InnerClass {
    // here class Test was dependent on the objects of InnerClass
    // so we used static which made it independent
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "name=" + name;
        }
    }

    static void main(String[] args) {
        Test a = new Test("Adwait");
        Test b = new Test("Jay");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a); // hex-code with default toString method
        System.out.println(b); // 
    }
}


// can't use static on global classes as they don't depend on any other class
//static class A {}
