// Exercise 8: University Management System — Multilevel Inheritance
// Design a multilevel inheritance hierarchy: Person -> Student -> GraduateStudent.
// Requirements:
// 1. Create a parameterized constructor in each class.
// 2. Use super() at each inheritance level.
// 3. Define displayInfo() in Person.
// 4. Override displayInfo() in Student and GraduateStudent.
// 5. Use super.displayInfo() to reuse the inherited implementation.
// 6. Create a GraduateStudent object and display all its information.
// Challenge: Print a message from every constructor to demonstrate constructor execution order.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        System.out.println("Person constructor called");
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        System.out.println("Student constructor called");
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

public class GraduateStudent extends Student {
    String researchTopic;

    GraduateStudent(String name, int age, String studentId, String researchTopic) {
        super(name, age, studentId);
        System.out.println("GraduateStudent constructor called");
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        System.out.println("------Graduate Student Info------");
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        GraduateStudent grad = new GraduateStudent("Alice Smith", 24, "G1001", "Artificial Intelligence");
        System.out.println();
        grad.displayInfo();
    }
}