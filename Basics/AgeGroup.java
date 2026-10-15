// Exercise 6: Age Group 
// Problem: 
// Print category based on age: 
// • <13 = Child 
// • 13–19 = Teen 
// • 20+ = Adult 
// Input: 16 
// Output: Teen


public class AgeGroup {
    int age;

    AgeGroup(int age) {
        this.age = age;
    }

    void classifyAge() {
        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }

    public static void main(String[] args) {
        AgeGroup person = new AgeGroup(16);
        person.classifyAge();
    }
}