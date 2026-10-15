// Exercise 3: Employee Salary
// Create a class Employee.
// Variables:
// String name;
// double salary;
// double bonus;
// Create a constructor to initialize the variables.
// Methods:
// double calculateTotalSalary()
// void displaySalary()
// Formula:
// Total Salary = Basic Salary + Bonus

class Employee {
	String name;
	double salary;
	double bonus;

	Employee(String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	double calculateSalary() {
		return salary + bonus;
	}

	void displaySalary() {
		System.out.println("Employee Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + calculateSalary());
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Arafat", 50000, 5000);
		employee.displaySalary();
	}
}
