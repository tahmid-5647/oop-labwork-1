// Exercise 1: Calculator 
// • Constructors: 
// 1. No-argument constructor → default mode = "Basic". 
// 2. Constructor with mode name. 
// • Method Overloading: 
// o add(int a, int b) 
// o add(double a, double b) 
// o add(int a, int b, int c) 
// • Normal Method: 
// o showMode() → print calculator mode. 


public class Calculator {
    String mode;

    Calculator() {
        this("Basic");
    }

    Calculator(String mode) {
        this.mode = mode;
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    void showMode() {
        System.out.println("Calculator Mode: " + mode);
    }

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator("Scientific");

        calc1.showMode();
        System.out.println("Sum of 5 and 10 (int): " + calc1.add(5, 10));
        System.out.println("Sum of 4.5 and 5.5 (double): " + calc1.add(4.5, 5.5));
        System.out.println("Sum of 1, 2, and 3 (three ints): " + calc1.add(1, 2, 3));

        System.out.println();

        calc2.showMode();
        System.out.println("Sum of 10 and 20 (int): " + calc2.add(10, 20));
    }
}