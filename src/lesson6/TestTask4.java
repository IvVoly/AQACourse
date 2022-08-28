package lesson6;

/*
4) Create a class A. Add several fields, two methods and parameterized constructors to it.
Create a class B that extends class A.
        Demonstrate in you program how class's B constructor should call class's A constructor to create
        a new object. Override one method of the class A to fully change it's behavior.
        Override another method to add some extra functionality to it, but it should then call class's A method.
        Create a test class and create several objects of class A and class B and call their methods.
*/

public class TestTask4 {
    public static void main(String[] args) {
        ElectricalToy toy = new ElectricalToy("beep", "yeelow", 3, 0, 0);
        Helicopter copter = new Helicopter("yeee", "green", 3, 0, 0, 0.0);
        toy.play();
        copter.setSong("Yohohoho");
        copter.play();
        toy.move(2);
        copter.move(2);
        for (int i : toy.getPosition()) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : copter.getPosition()) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(copter.getHeight());
    }
}
