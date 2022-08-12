package lesson4;
/*
3. Create 3 different classes to demonstrate the relationships "has-a" and "uses-a". They can be anything you want.
For example: Car - Engine - Wheels
 */

public class Car {
    Wheels wheels; // "Has-a"
    String type;

    public static void go(){
        Engine engine = new Engine();  // "uses -a"
        Engine.turnEngine();
    }
}
