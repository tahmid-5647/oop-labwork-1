// Exercise 1: Rectangle 
// Create a class Rectangle with overloaded constructors: 
// 1. No-argument constructor → sets length = 1, width = 1. 
// 2. Constructor with one argument → sets both length and width to the same value (square). 
// 3. Constructor with two arguments → sets length and width to different values. 
//  Add a method area() to calculate the area. 


public class Rectangle {
    int length;
    int width;

    Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Area of default rectangle (length = 1, width = 1): " + r1.area());
        System.out.println("Area of square (side = 5): " + r2.area());
        System.out.println("Area of rectangle (length = 4, width = 6): " + r3.area());
    }
}