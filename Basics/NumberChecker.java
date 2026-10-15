// Exercise 1: Positive or Negative 
// Problem: 
// Write a Java program that checks if a number is positive or negative. 
// Input: -5 
// Output: Negative number



public class NumberChecker {
    int number;

    NumberChecker(int number) {
        this.number = number;
    }

    void checkNumber() {
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker(-5);
        checker.checkNumber();
    }
}