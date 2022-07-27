package lesson2;

public class Task8 {
    public static void main(String[] args) {
        for(int i = 1; i < 101; i++){
            if(i % 2 != 0){
                if (i % 5 == 0 || i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
