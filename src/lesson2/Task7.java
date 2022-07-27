package lesson2;

public class Task7 {
    public static void main(String[] args){
        int[] arr = new int[10];
        int sumOfMidElem = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() *10);
            System.out.print(arr[i] + " ");
            if(i != 0 && i != arr.length -1){
                sumOfMidElem += arr[i];
            }
        }
        System.out.println();
        System.out.println("sum of elements except first and last: " + sumOfMidElem);
    }
}
