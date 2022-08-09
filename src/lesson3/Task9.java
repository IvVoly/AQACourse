package lesson3;

public class Task9 {
    public static void main(String[] args) {
        String a = "Infinity";
        getCharMatches(a);
    }
    public static void getCharMatches (String a){
        a = a.toLowerCase();
        char[] array = a.toCharArray();
        StringBuilder finString = new StringBuilder();
        for (int i = 0, z = 0; i < a.length();){
            for (int j = 0; j < a.length(); j++){
                if(array[i] == array[j]){
                    z++;
                }
            }
            String b = String.format("%c occurs %d times \n",array[i],z);
            finString.append(b);
            a = a.replaceAll(String.valueOf(array[i]),"");
            array = a.toCharArray();
            z = 0;
        }
        System.out.println(finString);
    }
}
