package lesson3;

public class Task1 {
    public static void main(String[] args) {
        String test = "AE_1381";
        if(test.length() < 2){
            System.out.println(test);
        }else{
            String test1 = test.substring(0,2);
            System.out.println(test1);
        }
    }
}
