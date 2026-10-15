// Exercise 2: Even or Odd 
// Problem: 
// Check if a number is even or odd using if-else. 
// Input: 14 
// Output: Even

public class EvenOddChecker {
    int number;

    EvenOddChecker(int number) {
        this.number = number;
    }

    void checkEvenOrOdd() {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        EvenOddChecker checker = new EvenOddChecker(14);
        checker.checkEvenOrOdd();
    }
}