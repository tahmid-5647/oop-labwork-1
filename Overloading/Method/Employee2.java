// Exercise 5: Employee Salary 
// Create a class Employee with overloaded constructors: 
// 1. Accepts only name. 
// 2. Accepts name and salary. 
// 3. Accepts name, salary, and designation. 
// Add a method showDetails() to print employee info.


public class Employee2 {
    String name;
    double salary;
    String designation;

    Employee2(String name) {
        this.name = name;
        this.salary = 0.0;
        this.designation = "Not Assigned";
    }

    Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.designation = "Not Assigned";
    }

    Employee2(String name, double salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    void showDetails() {
        System.out.println("Name: " + name + " | Salary: $" + salary + " | Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee2 e1 = new Employee2("Alice");
        Employee2 e2 = new Employee2("Bob", 55000.0);
        Employee2 e3 = new Employee2("Charlie", 85000.0, "Software Engineer");

        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
    }
}