package college.day3;

import java.lang.classfile.Signature;

class Singleton {

    // way 1 - make it once then return it in getter
//    private static Singleton object = new Singleton();

    private static Singleton object;

    // way 3 - by static block as it loads only once when class loads
    static {
        object = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance() {
        // way 2
//        if (object == null) object = new Singleton();
        return object;
    }
}

public class Main {
    static void main(String[] args) {
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//
//        // both objects will have different hash codes -
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());


        // Builder design
        Student s = new Student()
                .setAge(21)
                .setName("Adwait")
                .setEmail("adp@gmail.com");

        System.out.println(s);


    }
}
