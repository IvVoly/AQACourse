package lesson8;

/*3.Finish the program to handle all the possible exceptions:
        Print the cause of the exception to the console.*/

public class Task3 {
    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}
