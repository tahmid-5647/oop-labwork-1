// Exercise 5: Grading System 
// Problem: 
// Print grade based on marks: 
// • 90+ = A 
// • 80+ = B 
// • 70+ = C 
// • below 70 = Fail 
// Input: 75 
// Output: Grade: C


public class GradingSystem {
    int marks;

    GradingSystem(int marks) {
        this.marks = marks;
    }

    void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void main(String[] args) {
        GradingSystem student = new GradingSystem(75);
        student.calculateGrade();
    }
}