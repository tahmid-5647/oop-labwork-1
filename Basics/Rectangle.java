// 2. Rectangle  
// • Create a Rectangle class with attributes: length, width. 
// o Method calculateArea() to return area. 
// o Method calculatePerimeter() to return perimeter. 
// • In main, create a Rectangle object and display its area and perimeter.


public class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}