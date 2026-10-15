// Exercise 14: Weekday Name 
// Problem: 
// Take an integer (1–7) and return the day name. Use nested if-else. 
// Input: 3 
// Output: Wednesday


public class WeekdayName {
    int dayNumber;

    WeekdayName(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    void printDayName() {
        if (dayNumber >= 1 && dayNumber <= 7) {
            if (dayNumber == 1) {
                System.out.println("Monday");
            } else if (dayNumber == 2) {
                System.out.println("Tuesday");
            } else if (dayNumber == 3) {
                System.out.println("Wednesday");
            } else if (dayNumber == 4) {
                System.out.println("Thursday");
            } else if (dayNumber == 5) {
                System.out.println("Friday");
            } else if (dayNumber == 6) {
                System.out.println("Saturday");
            } else if (dayNumber == 7) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid day number");
        }
    }

    public static void main(String[] args) {
        WeekdayName checker = new WeekdayName(3);
        checker.printDayName();
    }
}