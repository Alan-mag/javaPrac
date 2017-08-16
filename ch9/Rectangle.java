import oracle.jrockit.jfr.events.EventHandlerImpl;

public class Rectangle implements Shape {
    private double width;
    private double height;

    // constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2.0 * (width + height);
    }
}