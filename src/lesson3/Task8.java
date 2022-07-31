package lesson3;

public class Task8 {
    public static void main(String[] args) {
        String card = "1234 5678 9012 3456";
        String[] newcard = card.split(" "); // if we know between numbers 1 space (" ")
        StringBuilder finCard = new StringBuilder();
        for (int i =0; i < newcard.length; i++){
            if(i < newcard.length-1){
                finCard.append("**** ");
            }else{
                finCard.append(newcard[i]);
            }
        }
        System.out.println(finCard);
    }
}
