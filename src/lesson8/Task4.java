package lesson8;

/*4.Fix the program to make it work:*/

public class Task4 {
    /*public static void main(String[] args) {     wrong variant
        try {
            int a = 0;
            int b = 4 / a;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) { // right variant
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
