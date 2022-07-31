package lesson2;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
    public static int getFactorial(int value){
        int factorValue = 1;
        if(value <=0 || value > 10){
            System.out.println("Input number from 1 to 10");
            return 0;
        }
        while (value > 0) {
            factorValue *= value;
            value--;
        }
        return factorValue;
    }
}
