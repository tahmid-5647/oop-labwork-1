// Exercise 6: Shape Area Calculator
// Create a superclass Shape with an attribute color. Create two subclasses: Rectangle and Circle.
// Requirements:
// 1. Define a parameterized constructor in Shape.
// 2. Call the superclass constructor from both subclasses.
// 3. Define calculateArea() in Shape, returning 0.0.
// 4. Override calculateArea() in Rectangle using length * width.
// 5. Override calculateArea() in Circle using Math.PI * radius * radius.
// 6. Override displayInfo() to display color, shape type, and area.
// Challenge: Store Rectangle and Circle objects inside a Shape[] array and calculate their areas using a loop.

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("------Circle Info------");
        System.out.println("Shape Type: Circle");
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("-----------------------");
    }
}

public class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public void displayInfo() {
        System.out.println("------Rectangle Info------");
        System.out.println("Shape Type: Rectangle");
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("Red", 5.0, 4.0);
        shapes[1] = new Circle("Blue", 3.0);

        for (Shape s : shapes) {
            s.displayInfo();
        }
    }
}