package lesson2;

public class Task4 {
    public static void main(String[] args) {
        int[] first = {2,4,9,16,25,36,49,64,81,100};
        int[] second = new int[10];
        for (int i = 0; i < first.length; i++) {
            double z = first[i];
            second[i] = (int) Math.sqrt(z);
            System.out.print(second[i] + " ");
        }
    }
}
