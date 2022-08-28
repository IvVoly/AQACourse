package lesson6;

/*5) Create an abstract class Figure. Add fields width and height to it.
Add an abstract method "calculateArea" which should be overridden by the concrete figures to calculate its area.
Figures: Rectangle, Triangle, Circle*/

public class TestTask5 {
    public static void main(String[] args) {
        Triangle tri = new Triangle(10, 7);
        System.out.println(tri.calculateArea());
        Triangle tri2 = new Triangle(3, 4, 5);
        System.out.println(tri2.calculateArea2());
        Circle circle = new Circle(4);
        System.out.println(circle.calculateArea());
        Rectangle rect = new Rectangle(15, 35);
        System.out.println(rect.calculateArea());
    }
}
