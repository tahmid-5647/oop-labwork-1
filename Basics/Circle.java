// 7. Circle Area & Circumference 
// • Create a Circle class with a field: radius. 
// • Assign value directly. 
// • Write methods to calculate and display the area and circumference.



public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void displayCalculations() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        circle.displayCalculations();
    }
}