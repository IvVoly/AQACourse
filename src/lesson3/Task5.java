package lesson3;

public class Task5 {
    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";
        String c;
        if(a.length() < b.length()){
            c = String.join(b,a,a);
        }else{
            c = String.join(a,b,b);
        }
        System.out.println(c);
    }
}
