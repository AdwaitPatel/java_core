package college.day2;

// user defined exceptions
class YouAreTooYoung extends RuntimeException {
    String msg;
    public YouAreTooYoung(String msg) {
        super(msg);
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ToString : " + msg;
    }
}

public class Main {
        public static void m1 () {
            String s = null;
            System.out.println(s.length());
        }
        public static void m2 () {
            try {
                m1();
            } catch (NullPointerException e) {
                System.out.println("String is null.");
            }
        }
        public static void m3 () {
            m2();
        }
    static void main(String[] args) {
//        m3();

//        try {
//            int[] arr = new int[0];
//           arr[0] = 100;
//            String s = null;
//            s.charAt(4);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println(e);
//        } catch (Exception e) { // this can handle all type of exceptions
//            System.out.println(e);
//        }


        // user defined exception example
//        int age = 18;
//        if (age > 20 && age <= 26) {
//            System.out.println("Done");
//        }
//        else {
//            try {
//                throw new YouAreTooYoung("phirse kabhi try kr");
//            } catch (YouAreTooYoung e) {
//                System.out.println(e.toString());
//            }
//        }

        try {
            System.out.println("A");
            Thread.sleep(5000); // just like setTimeout in js
            System.out.println("B");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
