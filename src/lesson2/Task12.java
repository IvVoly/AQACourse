package lesson2;

public class Task12 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        for (int i :array){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.printf("Two max numbers in array: %d,%d", getTwoMax(array)[0],getTwoMax(array)[1] );
    }

    public static int[] getTwoMax(int[] array){
        int[] twoMax = new int[2];
        twoMax[0] = array[0];
        for (int i = 0; i < twoMax.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j] && array[j] != twoMax[0]) {
                    int a = array[i];
                    int b = array[j];
                    array[i] = b;
                    array[j] = a;
                    j = i;
                }
            }
            twoMax[i] = array[i];
        }
        return twoMax;
    }
}

