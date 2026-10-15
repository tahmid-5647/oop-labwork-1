// Exercise 4: Number is Zero or Not 
// Problem: 
// Determine if a number is zero. 
// Input: 0 
// Output: Zero

public class NumberComparator {
    int num1;
    int num2;

    NumberComparator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void findGreater() {
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    public static void main(String[] args) {
        NumberComparator comp = new NumberComparator(12, 15);
        comp.findGreater();
    }
}