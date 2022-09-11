package lesson8;

/*3.Finish the program to handle all the possible exceptions:
        Print the cause of the exception to the console.*/

public class Task3 {
    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        int[] c = {1};
        try {
            System.out.println(c[1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }

    }
}
