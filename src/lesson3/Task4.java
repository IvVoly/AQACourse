package lesson3;

public class Task4 {
    public static void main(String[] args) {
        String check = "ABCDEFGHIJK";
        check = check.toLowerCase();
        final String VOWELS = "aoieuy";
        char[] checkArr = check.toCharArray();
        StringBuilder finString = new StringBuilder();
        for (char i : checkArr) {
            if(VOWELS.indexOf(i) == -1) {
                finString.append(i);
            }
        }
        check = finString.toString();
        System.out.println(check);
    }
}