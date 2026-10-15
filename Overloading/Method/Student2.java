// Exercise 2: Student2 Information 
// Create a class Student2 with overloaded constructors: 
// 1. Accepts only name. 
// 2. Accepts name and age. 
// 3. Accepts name, age, and department. 
//  Add a method displayInfo() to print student details.


public class Student2 {
    String name;
    int age;
    String department;

    Student2(String name) {
        this.name = name;
        this.age = 0;
        this.department = "Not Assigned";
    }

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "Not Assigned";
    }

    Student2(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age + " | Department: " + department);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("Alice");
        Student2 s2 = new Student2("Bob", 20);
        Student2 s3 = new Student2("Charlie", 22, "Software Engineering");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}