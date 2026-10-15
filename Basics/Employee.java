// 5. Employee Salary 
// • Create an Employee class with fields: name, designation, and salary. 
// • Assign values directly in main. 
// • Write a method increaseSalary() to add a given amount to salary. 
// • Display updated salary.


public class Employee {
    String name;
    String designation;
    double salary;

    Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Updated Salary for " + name + ": " + salary);
        }
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Designation: " + designation + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Software Engineer", 50000.0);
        emp.displayInfo();
        emp.increaseSalary(5000.0);
    }
}