// Exercise 5: Shape 
// • Constructors: 
// 1. Default constructor → "Unknown Shape". 
// 2. Constructor with shape name. 
// • Method Overloading: 
// o area(int side) → square. 
// o area(int length, int width) → rectangle. 
// o area(double radius) → circle. 
// • Normal Method: 
// o showShape() → print shape type. 


public class Shape {
    String shapeName;

    Shape() {
        this("Unknown Shape");
    }

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    double area(int side) {
        return side * side;
    }

    double area(int length, int width) {
        return length * width;
    }

    double area(double radius) {
        return 3.1416 * radius * radius;
    }

    void showShape() {
        System.out.println("Shape Type: " + shapeName);
    }

    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape("Custom Shape");

        s1.showShape();
        System.out.println("Area of Square (side = 4): " + s1.area(4));
        System.out.println("Area of Rectangle (length = 5, width = 3): " + s1.area(5, 3));

        System.out.println();

        s2.showShape();
        System.out.println("Area of Circle (radius = 3.5): " + s2.area(3.5));
    }
}