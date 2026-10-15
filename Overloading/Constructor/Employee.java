// Exercise 1: Employee Salary 
// Create a class Employee. 
// Variables: 
// String name; 
// double salary; 
// double bonus; 
// Constructor overloading: 
// Employee(String name) 
// Employee(String name, double salary) 
// Employee(String name, double salary, double bonus) 
// Method overloading: 
// double calculateSalary() 
// double calculateSalary(double overtime) 
// double calculateSalary(double overtime, double allowance) 
// Rules: 
// calculateSalary()= salary + bonus 
// calculateSalary(overtime)= salary + bonus + overtime 
// calculateSalary(overtime, allowance)= salary + bonus + overtime + allowance

public class Employee {
    String name;
    double salary;
    double bonus;

    Employee(String name) {
        this.name = name;
        this.salary = 0.0;
        this.bonus = 0.0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = 0.0;
    }

    Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return salary + bonus;
    }

    double calculateSalary(double overtime) {
        return salary + bonus + overtime;
    }

    double calculateSalary(double overtime, double allowance) {
        return salary + bonus + overtime + allowance;
    }

    void displayEmployeeInfo() {
        System.out.println();
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("taqi");
        emp1.displayEmployeeInfo();
        System.out.println("Total Salary: " + emp1.calculateSalary());

        Employee emp2 = new Employee("tahmid", 30000);
        emp2.displayEmployeeInfo();
        System.out.println("Total Salary (with overtime): " + emp2.calculateSalary(3000));

        Employee emp3 = new Employee("rahim", 45000, 5000);
        emp3.displayEmployeeInfo();
        System.out.println("Total Salary (with overtime & allowance): " + emp3.calculateSalary(4000, 2000));
    }
}