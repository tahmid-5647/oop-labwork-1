// Exercise 8: Smallest of Three Numbers 
// Problem: 
// Determine the smallest among three numbers using if-else-if. 
// Input: 5 9 3 
// Output: Smallest is 3


public class SmallestNumber {
    int num1;
    int num2;
    int num3;

    SmallestNumber(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    void findSmallest() {
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Smallest is " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Smallest is " + num2);
        } else {
            System.out.println("Smallest is " + num3);
        }
    }

    public static void main(String[] args) {
        SmallestNumber finder = new SmallestNumber(5, 9, 3);
        finder.findSmallest();
    }
}