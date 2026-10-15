// Exercise 7: Leap Year Checker 
// Problem: 
// Check if a year is a leap year using logical operators. 
// Input: 2024 
// Output: Leap Year


public class LeapYearChecker {
    int year;

    LeapYearChecker(int year) {
        this.year = year;
    }

    void checkLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        LeapYearChecker checker = new LeapYearChecker(2024);
        checker.checkLeapYear();
    }
}