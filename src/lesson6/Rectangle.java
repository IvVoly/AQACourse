package lesson6;

/*5) Create an abstract class Figure. Add fields width and height to it.
Add an abstract method "calculateArea" which should be overridden by the concrete figures to calculate its area.
Figures: Rectangle, Triangle, Circle*/

public class Rectangle extends Figure {

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle() {

    }

    @Override
    public double calculateArea() {
        return getWidth() * getHeight();
    }

}
