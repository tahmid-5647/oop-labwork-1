// Exercise 7: Area Calculator 
// Create a class Area. 
// Variables: 
// double value1; 
// double value2; 
// Constructor overloading: 
// Area() 
// Area(double value1) 
// Area(double value1, double value2) 
// Method overloading: 
// double calculate(int side) 
// double calculate(int length, int width) 
// double calculate(double radius) 
// Calculate: 
// • Square area  
// • Rectangle area  
// • Circle area

public class Area {
    double value1;
    double value2;

    Area() {
        this.value1 = 0.0;
        this.value2 = 0.0;
    }

    Area(double value1) {
        this.value1 = value1;
        this.value2 = 0.0;
    }

    Area(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    double calculate(int side) {
        return side * side;
    }

    double calculate(int length, int width) {
        return length * width;
    }

    double calculate(double radius) {
        return 3.1416 * radius * radius;
    }

    void displayValues() {
        System.out.println();
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }

    public static void main(String[] args) {
        Area areaObj1 = new Area();
        Area areaObj2 = new Area(5.0);
        Area areaObj3 = new Area(10.0, 4.0);

        areaObj1.displayValues();
        System.out.println("Square Area (side = 5): " + areaObj1.calculate(5));

        areaObj2.displayValues();
        System.out.println("Rectangle Area (length = 10, width = 4): " + areaObj2.calculate(10, 4));

        areaObj3.displayValues();
        System.out.println("Circle Area (radius = 7.0): " + areaObj3.calculate(7.0));
    }
}