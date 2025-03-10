public class Circle {
    private double radius;


    // Default constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
