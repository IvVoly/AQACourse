package lesson6;

/*5) Create an abstract class Figure. Add fields width and height to it.
Add an abstract method "calculateArea" which should be overridden by the concrete figures to calculate its area.
Figures: Rectangle, Triangle, Circle*/

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;


    public Triangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {

    }

    @Override
    public double calculateArea() {
        return 0.5 * getWidth() * getHeight();
    }

    public double calculateArea2() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

}

