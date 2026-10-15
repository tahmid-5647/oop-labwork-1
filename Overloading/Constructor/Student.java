// Exercise 2: Student 
// • Constructors: 
// 1. Accepts only id. 
// 2. Accepts id and name. 
// 3. Accepts id, name, and grade. 
// • Method Overloading: 
// o updateGrade(char grade) 
// o updateGrade(double marks) (converts marks to grade internally). 
// • Normal Method: 
// o showDetails() → print student details.


public class Student {
    String id;
    String name;
    char grade;

    Student(String id) {
        this(id, "Unknown", 'U');
    }

    Student(String id, String name) {
        this(id, name, 'U');
    }

    Student(String id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    void updateGrade(char grade) {
        this.grade = grade;
    }

    void updateGrade(double marks) {
        if (marks >= 90) {
            this.grade = 'A';
        } else if (marks >= 80) {
            this.grade = 'B';
        } else if (marks >= 70) {
            this.grade = 'C';
        } else if (marks >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }

    void showDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("S101", "Alice", 'B');
        Student s2 = new Student("S102", "Bob");
        Student s3 = new Student("S103");

        s1.showDetails();

        s2.updateGrade(85.5);
        s2.showDetails();

        s3.updateGrade('A');
        s3.showDetails();
    }
}