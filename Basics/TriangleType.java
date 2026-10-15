// Exercise 18: Triangle Type 
// Problem: 
// Check triangle type: 
// • All sides equal → Equilateral 
// • Two equal → Isosceles 
// • All different → Scalene 
// Input: 3 3 3 
// Output: Equilateral


public class TriangleType {
    int side1;
    int side2;
    int side3;

    TriangleType(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void classifyTriangle() {
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }

    public static void main(String[] args) {
        TriangleType triangle = new TriangleType(3, 3, 3);
        triangle.classifyTriangle();
    }
}