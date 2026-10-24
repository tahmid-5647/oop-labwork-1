// Exercise 4: Simple Calculator 
// Write a class Calculator with overloaded methods add that: 
// 1. Adds two integers. 
// 2. Adds two doubles. 
// 3. Adds three integers. 
// 4. Concatenates two strings.

public class Calculator2 {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    String add(String str1, String str2) {
        return str1 + str2;
    }
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();

        int sumTwoInts = calc.add(10, 20);
        System.out.println("Two integers sum: " + sumTwoInts);

        double sumTwoDoubles = calc.add(5.5, 4.2);
        System.out.println("Two doubles sum: " + sumTwoDoubles);

        int sumThreeInts = calc.add(10, 20, 30);
        System.out.println("Three integers sum: " + sumThreeInts);

        String concatenated = calc.add("Hello, ", "World!");
        System.out.println("Concatenated strings: " + concatenated);
    }
}