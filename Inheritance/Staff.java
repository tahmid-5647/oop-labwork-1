// Exercise 5: University Management System  
// Base class: Person 
// • Instance variables: 
// o name (String) 
// o age (int) 
// • Constructor: 
// o Initializes both variables and prints "Person constructor called". 
// • Methods: 
// 1. calculateAllowance() → returns base allowance of 1000. 
// ▪ Print "Base allowance calculated in Person class." 
// 2. getRole() → returns "General Person". 
// 3. displayInfo() → prints name and age only. 
// Derived class 1: Student (extends Person) 
// • Instance variable: 
// o studentId (String) 
// • Constructor: 
// o Calls super(name, age) and prints "Student constructor called". 
// • Overridden methods: 
// 1. calculateAllowance() → 
// ▪ Calls super.calculateAllowance() and adds +500 for study materials. 
// ▪ Print "Student allowance includes study materials." 
// 2. getRole() → returns "Student". 
// 3. displayInfo() → 
// ▪ Calls super.displayInfo() to print name and age. 
// ▪ Adds studentId and prints "Displaying Student information." 
// 4. getDailySchedule() → new method printing a message like 
// "Student attends classes and library sessions." 
// Derived class 2: Teacher (extends Person) 
// • Instance variable: 
// o subject (String) 
// • Constructor: 
// o Calls super(name, age) and prints "Teacher constructor called". 
// • Overridden methods: 
// 1. calculateAllowance() → 
// ▪ Calls super.calculateAllowance() and adds +800 as teaching bonus. 
// ▪ Print "Teacher allowance includes teaching bonus." 
// 2. getRole() → returns "Teacher". 
// 3. displayInfo() → 
// ▪ Calls super.displayInfo() for base info. 
// ▪ Adds subject and prints "Displaying Teacher information." 
// 4. getDailySchedule() → 
// ▪ Print "Teacher conducts lectures, grading, and student advising." 
 
// Derived class 3: Staff (extends Person) 
// • Instance variable: 
// o department (String) 
// • Constructor: 
// o Calls super(name, age) and prints "Staff constructor called". 
// • Overridden methods: 
// 1. calculateAllowance() → 
// ▪ Calls super.calculateAllowance() and adds +300 operational allowance. 
// ▪ Print "Staff allowance includes operational bonus." 
// 2. getRole() → returns "Administrative Staff". 
// 3. displayInfo() → 
// ▪ Calls super.displayInfo() for base info. 
// ▪ Adds department and prints "Displaying Staff information." 
// 4. getDailySchedule() → 
// ▪ Print "Staff handles office management and administrative support." 
// Main method tasks 
// 1. Create one Student, one Teacher, and one Staff object using sample data. 
// 2. Observe constructor chaining sequence: 
// "Person constructor called" → "Student/Teacher/Staff constructor called". 
// 3. For each object: 
// o Call displayInfo() to view all inherited + subclass data. 
// o Call calculateAllowance() to see how each subclass customizes the base logic 
// differently using super. 
// o Call getRole() to show overridden identity behavior. 
// o Call getDailySchedule() to display their specific daily routines.



class Person {
    String name;
    int age;

    Person(String name, int age) {
        System.out.println("Person constructor called");
        this.name = name;
        this.age = age;
    }

    public double calculateAllowance() {
        System.out.println("Base allowance calculated in Person class.");
        return 1000.0;
    }

    public String getRole() {
        return "General Person";
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
    public double calculateAllowance() {
        double base = super.calculateAllowance();
        System.out.println("Student allowance includes study materials.");
        return base + 500.0;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public void displayInfo() {
        System.out.println("------Student Information------");
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Role: " + getRole());
        System.out.println("Total Allowance: " + calculateAllowance());
        System.out.println("Displaying Student information.");
        System.out.println("-------------------------------");
    }

    public void getDailySchedule() {
        System.out.println("Daily Schedule: Student attends classes and library sessions.");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        System.out.println("Teacher constructor called");
        this.subject = subject;
    }

    @Override
    public double calculateAllowance() {
        double base = super.calculateAllowance();
        System.out.println("Teacher allowance includes teaching bonus.");
        return base + 800.0;
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    @Override
    public void displayInfo() {
        System.out.println("------Teacher Information------");
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Role: " + getRole());
        System.out.println("Total Allowance: " + calculateAllowance());
        System.out.println("Displaying Teacher information.");
        System.out.println("-------------------------------");
    }

    public void getDailySchedule() {
        System.out.println("Daily Schedule: Teacher conducts lectures, grading, and student advising.");
    }
}

public class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        System.out.println("Staff constructor called");
        this.department = department;
    }

    @Override
    public double calculateAllowance() {
        double base = super.calculateAllowance();
        System.out.println("Staff allowance includes operational bonus.");
        return base + 300.0;
    }

    @Override
    public String getRole() {
        return "Administrative Staff";
    }

    @Override
    public void displayInfo() {
        System.out.println("------Staff Information------");
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Role: " + getRole());
        System.out.println("Total Allowance: " + calculateAllowance());
        System.out.println("Displaying Staff information.");
        System.out.println("-----------------------------");
    }

    public void getDailySchedule() {
        System.out.println("Daily Schedule: Staff handles office management and administrative support.");
    }

    public static void main(String[] args) {
        System.out.println("=== Creating Student Object ===");
        Student student = new Student("Alice Smith", 20, "S1001");
        System.out.println();
        student.displayInfo();
        student.getDailySchedule();

        System.out.println("\n=== Creating Teacher Object ===");
        Teacher teacher = new Teacher("Dr. Robert Johnson", 45, "Computer Science");
        System.out.println();
        teacher.displayInfo();
        teacher.getDailySchedule();

        System.out.println("\n=== Creating Staff Object ===");
        Staff staff = new Staff("Emily Davis", 32, "Registrar Office");
        System.out.println();
        staff.displayInfo();
        staff.getDailySchedule();
    }
}