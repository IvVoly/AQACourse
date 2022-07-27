package lesson2;

public class Task6 {
    public static void main(String[] args) {
        // a)

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // b)
        for(int i = 0; i < 5; i++){
            if(i == 0 || i == 4) {
                for (int j = 0; j < 8; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else {
                for (int j = 0; j < 8; j++) {
                    if(j == 0 || j == 7) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();

        // c)
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                if((i-j) >= 0) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // d)
        for(int i = 0; i < 5; i++){
            for(int j = 4; j > 0; j--) {
                if ((j-i) > 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("*");
            for(int j = 0; j < 4; j++){
                if((j-i) >= 0) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
