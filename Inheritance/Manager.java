// Exercise 4: Employee Salary Management System
// Create a superclass Employee containing name, employeeId, and basicSalary.
// Create a subclass Manager containing an additional attribute bonus.
// Requirements:
// 1. Initialize all employee information using constructors.
// 2. Use super() inside the Manager constructor.
// 3. Define calculateSalary() in Employee that returns basicSalary.
// 4. Override calculateSalary() in Manager so it returns basicSalary + bonus.
// 5. Override displayDetails() to print all relevant information.
// 6. Create objects of Employee and Manager and compare their salaries.
// Sample data: Employee (Rahim, 101, 30,000), Manager (Karim, 102, 50,000, bonus 15,000).
// Expected salary: Employee = 30,000, Manager = 65,000.

class Employee {
    String name;
    String employeeId;
    double basicSalary;

    Employee(String name, String employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return this.basicSalary;
    }

    public void displayDetails() {
        System.out.println("------Employee Details------");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("----------------------------");
    }
}

public class Manager extends Employee {
    double bonus;

    Manager(String name, String employeeId, double basicSalary, double bonus) {
        super(name, employeeId, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.basicSalary + this.bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("------Manager Details------");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rahim", "101", 30000.0);
        emp.displayDetails();

        Manager mgr = new Manager("Karim", "102", 50000.0, 15000.0);
        mgr.displayDetails();

        System.out.println("\nSalary Comparison:");
        System.out.println("Employee Salary = " + emp.calculateSalary());
        System.out.println("Manager Salary = " + mgr.calculateSalary());
    }
}