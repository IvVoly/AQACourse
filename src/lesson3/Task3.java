package lesson3;

public class Task3 {
    public static void main(String[] args) {
        String word1 = "The End";
        String word2 = "End The";
        boolean startThe1 = word1.startsWith("The");
        boolean startThe2 = word2.startsWith("The");
        System.out.println("Word 1 start with \"The\" ?: " + startThe1);
        System.out.println("Word 2 start with \"The\" ?: " + startThe2);
    }
}
