package lesson7;

/*1) Create a new interface "Flyable". This interface should have one method "void fly()".
Create two new classes "Bird" and "Duck" which implement "Flyable" interface.
Provide your implementation for the "fly" method.*/


public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying   \uD80C\uDD69");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
    }
}
