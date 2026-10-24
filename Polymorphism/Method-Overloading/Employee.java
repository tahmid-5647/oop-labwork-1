// Exercise 5: Calculate Salary
// Create a class Employee and overload a method named calculateSalary().
// Use:
// calculateSalary(double basicSalary);
// calculateSalary(double basicSalary, double bonus);
// calculateSalary(double basicSalary, double bonus, double overtime);
// The methods should return the employee's total salary.
 

public class Employee {
    double calculateSalary(double basicSalary) {
        return basicSalary;
    }

    double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    double calculateSalary(double basicSalary, double bonus, double overtime) {
        return basicSalary + bonus + overtime;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        double salary1 = emp.calculateSalary(30000.0);
        System.out.println("Basic Salary: " + salary1);

        double salary2 = emp.calculateSalary(30000.0, 5000.0);
        System.out.println("Basic Salary + Bonus: " + salary2);

        double salary3 = emp.calculateSalary(30000.0, 5000.0, 2000.0);
        System.out.println("Basic Salary + Bonus + Overtime: " + salary3);
    }
}