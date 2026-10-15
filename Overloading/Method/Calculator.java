// Exercise 1: Add Numbers 
// Create a class Calculator and overload a method named add() to: 
// • Add two int numbers  
// • Add three int numbers  
// • Add two double numbers  
// Example: 
// add(10, 20); 
// add(10, 20, 30); 
// add(5.5, 4.2);

public class Calculator {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);
        System.out.println("add(10, 20) = " + sum1);

        int sum2 = calc.add(10, 20, 30);
        System.out.println("add(10, 20, 30) = " + sum2);

        double sum3 = calc.add(5.5, 4.2);
        System.out.println("add(5.5, 4.2) = " + sum3);
    }
}