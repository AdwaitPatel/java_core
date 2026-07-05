package oop.oop6.exceptionHandling;

public class Main {
    static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
//            int c = a / b;
//            System.out.println(divide(a, b));

            // mimic exception
//            throw new Exception("Just for fun");

            String name = "adp";
            if (name.equals("adp")) {
                throw new MyException("Name is adwait");
            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("other exception");
        } finally {
            System.out.println("This will always run");
        }



    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw  new ArithmeticException("plz don't divide by 0");
        }
        return a / b;
    }
}
