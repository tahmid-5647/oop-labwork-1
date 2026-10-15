// Exercise 2: Rectangle
// Create a class Rectangle.
// Variables:
// double length;
// double width;
// Constructor overloading:
// Rectangle()
// Rectangle(double side)
// Rectangle(double length, double width)
// Create overloaded methods named calculate():
// double calculate()
// double calculate(double length)
// double calculate(double length, double width)

public class Rectangle {
    double length;
    double width;

    Rectangle() {
        System.out.println("variable uninitialized");
    }

    Rectangle(double side) {
        this.length = side;
        this.width = side;
        System.out.println("side: " + side);
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("length: " + length + " & width: " + width);
    }

    double calculate() {
        System.out.println("calculation failed due to uninitialization");
        return 0;
    }

    double calculate(double length) {
        return length * length;
    }

    double calculate(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Rectangle 1");
        Rectangle rec1 = new Rectangle();
        rec1.calculate();

        System.out.println();
        System.out.println("Rectangle 2");
        Rectangle rec2 = new Rectangle(4);
        System.out.println("area: " + rec2.calculate(rec2.length));
        
        System.out.println();
        System.out.println("Rectangle 3");
        Rectangle rec3 = new Rectangle(12, 3);
        System.out.println("area: " + rec3.calculate(rec3.length, rec3.width));
    }
}