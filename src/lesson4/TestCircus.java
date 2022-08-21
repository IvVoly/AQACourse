package lesson4;
/*
10. Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.
 */
public class TestCircus {
    public static void main(String[] args) {
        Circus circus = new Circus();
        System.out.println("1 - " + circus.salary(200,1800,35));
        System.out.println("2 - " + circus.salary(300,3000));
        System.out.println("3 - " + circus.salary(100));
    }
}
