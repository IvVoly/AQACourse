package lesson6;

/*5) Create an abstract class Figure. Add fields width and height to it.
Add an abstract method "calculateArea" which should be overridden by the concrete figures to calculate its area.
Figures: Rectangle, Triangle, Circle*/

public abstract class Figure {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double heght) {
        this.height = heght;
    }

    public abstract double calculateArea();
}
