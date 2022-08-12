package lesson4;

//9. Write your own example of the recursive function. You can find a lot of examples on the Internet.

public class Recurs {
    public static void main(String[] args) {
        for (int i = 1; i < 11 ; i++) {
            System.out.println(fiba(i));
        }
    }
    public static int fiba(int x){
        if(x <= 0){
            return 0;
        }else if(x ==1){
            return 1;
        }else{
            return fiba(x-2) + fiba(x-1);
        }
    }
}
