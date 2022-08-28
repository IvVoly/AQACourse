package lesson7;

/*1) Create a new interface "Flyable". This interface should have one method "void fly()".
Create two new classes "Bird" and "Duck" which implement "Flyable" interface.
Provide your implementation for the "fly" method.*/

public class Duck implements Flyable {
    @Override
    public void fly() {
        System.out.println("Duck is flying  \uD80C\uDD6E");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
    }
}
