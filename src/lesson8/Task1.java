package lesson8;

/*
1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0
throw your own exception.
        Arithmetic ex, Exception ex;
*/

public class Task1 {

    static void method(int number) {
        if (number < 0) {
            System.out.println("Number < 0");
        } else if (number > 0) {
            System.out.println("Number > 0");
        } else if (number == 0) {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        method(0);
    }

    public static class ArithmeticException extends RuntimeException {
    }
}