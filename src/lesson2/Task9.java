package lesson2;

public class Task9 {
        public static void main(String[] args) {
            int[] newArr = new int[5];
            int stop = 0;
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = (int) (Math.random() * 10);
            }
            while(stop != newArr.length-1){
                stop = 0;
                for(int j =1; j < newArr.length; j++){
                    if (newArr[j] < newArr[j-1]) {
                        int a = newArr[j];
                        int b = newArr[j-1];
                        newArr[j-1] = a;
                        newArr[j] = b;
                    }else{
                        stop++;
                    }
                }
            }
            System.out.print("sorted array from min to max: ");
            for(int i : newArr){
                System.out.print(i + " ");
            }

        }
}
