public class Cylinder {
    private double r;
    private double h;
    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
    public double surfaceArea() {
        return 2 * 3.14 * r * (h + r);
    }
    public double volume() {
        return r * r * h * 3.14;
    }
    @Override
    public String toString() {
        return "Cylinder with radius: " + r + " and height: " + h;
    }
}
