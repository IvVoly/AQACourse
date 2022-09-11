package lesson8;

/*6. Write a program that will read numbers from the keyboard.
        The code for reading numbers from the keyboard must be in the readData method.
        The code inside the readData is wrapped in a try..catch.
        If the user entered some text, instead of a number, this method should catch the exception and display all
        previously entered numbers as a result. Each number should be printed from a new line
        preserving the order of the input.*/


import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        while (true) {
            try {
                int x = Integer.parseInt(scanner.nextLine());
                data.add(x);
            } catch (NumberFormatException e) {
                System.out.println("Enter a number !");
                for (int i : data) {
                    System.out.println(i);
                }
            }
        }
    }
}
