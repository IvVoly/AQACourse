package lesson2;

public class Task5 {
    public static void main(String[] args) {
        int n = 5;
        int factorValue = 1;
        for (; n > 0; n--) {
            factorValue *= n;
        }
        System.out.println("Factorial n: " + factorValue);
    }
}

