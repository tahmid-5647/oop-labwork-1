// Exercise 3: Employee Salary Validation
// Create a Java class named Employee with the private attributes employeeId, name, and salary.
// Requirements:
// 1. Initialize attributes using a constructor.
// 2. Implement getter methods for all attributes.
// 3. Make employeeId read-only after object creation.
// 4. Provide setter methods for name and salary.
// 5. setSalary() must reject negative values.
// 6. setName() must reject blank names.
// 7. Create a method increaseSalary(double percentage) that validates the percentage before updating the salary.
// Challenge: Do not allow the employee ID to be changed after the object is created.

public class Employee {
    private String employeeId;
    private String name;
    private double salary;

    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        setName(name);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be null, empty, or whitespace-only.");
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            double increaseAmount = this.salary * (percentage / 100.0);
            this.salary += increaseAmount;
            System.out.println("Successfully increased salary by " + percentage + "%");
            System.out.println("Updated Salary: " + getSalary());
        } else {
            System.out.println("Error: Percentage must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("------Employee Info------");
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Employee emp = new Employee("E001", "John Doe", 50000.0);
        emp.displayInfo();

        emp.increaseSalary(10.0);
        emp.setSalary(55000.0);
        emp.displayInfo();
    }
}