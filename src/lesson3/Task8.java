package lesson3;

public class Task8 {
    public static void main(String[] args) {
        String card = "1234 5678 9012 3456";
        String[] newCard = card.split(" "); // if we know between numbers 1 space (" ")
        StringBuilder finCard = new StringBuilder();
        for (int i =0; i < newCard.length; i++){
            if(i < newCard.length-1){
                finCard.append("**** ");
            }else{
                finCard.append(newCard[i]);
            }
        }
        System.out.println(finCard);
    }
}
