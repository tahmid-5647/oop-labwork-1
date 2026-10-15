// 11. Grade Management System 
// • Create a Student class with fields: name, rollNumber, and an array marks[] for 5 subjects. 
// • Add methods: 
// o calculateAverage() → returns average marks. 
// o calculateGrade() → returns grade (A/B/C/D/F) based on average. 
// • In main, assign marks directly and display name, roll number, average, and grade.



public class Student {
    String name;
    int rollNumber;
    double[] marks;

    Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else if (avg >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        double[] subjectMarks = {85.5, 90.0, 78.0, 92.0, 88.5};
        Student student = new Student("Alex", 101, subjectMarks);
        student.displayDetails();
    }
}