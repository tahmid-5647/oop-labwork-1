// Exercise 1: Area Calculation 
// Create a class AreaCalculator with overloaded methods named area to calculate: 
// 1. The area of a circle (accepts radius as parameter). 
// 2. The area of a rectangle (accepts length and width). 
// 3. The area of a square (accepts side). 
// 4. The area of a triangle (accepts base and height). 

public class AreaCalculator {
    double area(double radius) {
        return 3.1416 * radius * radius;
    }

    double area(double length, double width) {
        return length * width;
    }

    int area(int side) {
        return side * side;
    }

    double area(float base, float height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        double circleArea = calc.area(7.0);
        System.out.println("Area of Circle: " + circleArea);

        double rectangleArea = calc.area(10.0, 5.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        int squareArea = calc.area(4);
        System.out.println("Area of Square: " + squareArea);

        double triangleArea = calc.area(6.0f, 8.0f);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}