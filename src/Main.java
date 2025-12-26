public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.2);
        Circle circle3 = new Circle(7.5);
        Cylinder cylinder1 = new Cylinder(4.0, 10.0);
        Cylinder cylinder2 = new Cylinder(2.5, 5.0);
        System.out.println("Circle1 circumference: " +  circle1.circumference());
        System.out.println("Circle2 circumference: " +  circle2.circumference());
        System.out.println("Circle3 circumference: " +  circle3.circumference());
        System.out.println("Circle1 area: " + circle1.area());
        System.out.println("Circle2 area: " + circle2.area());
        System.out.println("Circle3 area: " + circle3.area());
        System.out.println("Cylinder1 surface area: " + cylinder1.surfaceArea());
        System.out.println("Cylinder2 surface area: " + cylinder2.surfaceArea());
        System.out.println("Cylinder1 volume: "  + cylinder1.volume());
        System.out.println("Cylinder2 volume: "  + cylinder2.volume());
    }
}