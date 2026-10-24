// Exercise 2: University Staff System 
// 1. Base class: Staff 
// o Instance variables: staffId, name 
// o Constructor: initialize variables, print "Staff constructor called". 
// 2. Derived class: Professor (extends Staff) 
// o Instance variable: department 
// o Constructor: use super() and print "Professor constructor called". 
// 3. Method: displayInfo() to print all details. 
// 4. Main method: 
// o Create a Professor object with sample data. 
// o Display info. 



class Staff {
    String staffId;
    String name;

    Staff(String staffId, String name) {
        System.out.println("Staff constructor called");
        this.staffId = staffId;
        this.name = name;
    }
}

public class Professor extends Staff {
    String department;

    Professor(String staffId, String name, String department) {
        super(staffId, name);
        System.out.println("Professor constructor called");
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("------Professor Details------");
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Professor prof = new Professor("S101", "Dr. John Doe", "Computer Science");
        System.out.println();
        prof.displayInfo();
    }
}