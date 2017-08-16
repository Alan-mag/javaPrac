// Has-A Relationship example (chapter 9.4)
public class Circle {
    private Point center;
    private double radius;

    // constructs a new circle with the given radius
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // returns the area of this circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
}