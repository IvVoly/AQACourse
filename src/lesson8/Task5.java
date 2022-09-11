package lesson8;

/*5.Throw a NullPointerException from the method iCanThrowException();
        Handle it in the main method.*/

public class Task5 {
    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void iCanThrowException() throws NullPointerException {

    }
}
