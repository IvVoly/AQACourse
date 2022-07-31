package lesson2;

public class Task11 {
    public static void main(String[] args) {
        int[] newArr = new int[5];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < newArr.length-1 ; i++) {
            for(int j = i+1 ; j <=newArr.length-1; j++ ){
                if(newArr[i] > newArr[j]){
                    int a = newArr[i];
                    int b = newArr[j];
                    newArr[i] = b;
                    newArr[j] = a;
                }
            }
        }
        System.out.print("sorted array from min to max: ");
        for(int i : newArr){
            System.out.print(i + " ");
        }

    }
}
