package lesson3;

public class Task2 {
    public static void main(String[] args) {
        String word = "Welcome to Java World";
        String tag = "p";
        String firTag = String.join(tag,"<",">");
        String lastTag = "<" + "/" + tag + ">";
        String check = String.join(word,firTag,lastTag);
        System.out.println(check);
    }
}
