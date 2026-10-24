// Exercise 9: Point in 2D Space 
// Create a class Point with overloaded constructors: 
// 1. No-argument constructor → initializes (0,0). 
// 2. Constructor with x. 
// 3. Constructor with x and y. 
//  Add a method distanceFromOrigin() that returns the distance of the point from (0,0)


public class Point {
    double x;
    double y;

    Point() {
        this(0.0, 0.0);
    }

    Point(double x) {
        this(x, 0.0);
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(5.0);
        Point p3 = new Point(3.0, 4.0);

        System.out.println("Point 1 (default): (" + p1.x + ", " + p1.y + ") | Distance from origin: " + p1.distanceFromOrigin());
        System.out.println("Point 2 (x only): (" + p2.x + ", " + p2.y + ") | Distance from origin: " + p2.distanceFromOrigin());
        System.out.println("Point 3 (x and y): (" + p3.x + ", " + p3.y + ") | Distance from origin: " + p3.distanceFromOrigin());
    }
}