// Exercise 3: Greater of Two Numbers 
// Problem: 
// Print the larger number among two inputs. 
// Input: 12 15 
// Output: 15 is greater


public class ZeroChecker {
    int number;

    ZeroChecker(int number) {
        this.number = number;
    }

    void checkZero() {
        if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Not Zero");
        }
    }

    public static void main(String[] args) {
        ZeroChecker checker = new ZeroChecker(0);
        checker.checkZero();
    }
}