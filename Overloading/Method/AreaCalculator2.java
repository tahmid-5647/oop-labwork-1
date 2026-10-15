// Exercise 2: Find Area 
// Create a class AreaCalculator and overload a method named area() to calculate: 
// • Area of a square: area(int side)  
// • Area of a rectangle: area(int length, int width)  
// • Area of a circle: area(double radius)  
// Expected formulas: 
// Square = side × side 
// Rectangle = length × width 
// Circle = π × radius × radius 

public class AreaCalculator2 {
    int area(int side) {
        return side * side;
    }

    int area(int length, int width) {
        return length * width;
    }

    double area(double radius) {
        return 3.1416 * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator2 calc = new AreaCalculator2();

        int squareArea = calc.area(5);
        System.out.println("Area of Square (side = 5): " + squareArea);

        int rectangleArea = calc.area(10, 4);
        System.out.println("Area of Rectangle (length = 10, width = 4): " + rectangleArea);

        double circleArea = calc.area(7.0);
        System.out.println("Area of Circle (radius = 7.0): " + circleArea);
    }
}