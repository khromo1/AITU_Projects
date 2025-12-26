public class Circle {
    private double r;
    public Circle(double radius) {
        this.r=r;
    }
    public double circumference() {
        return 2*3.14*this.r;
    }
    public double area() {
        return 3.14*this.r*this.r;
    }
    @Override
    public String toString() {
        return "Circle with radius: " + r;
    }
 }