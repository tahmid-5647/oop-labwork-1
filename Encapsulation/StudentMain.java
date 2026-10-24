// Exercise 1: Student Information Management 
// Create a Java class named Student with the following private attributes: 
// Attribute Data type 
// name String 
// age int 
// cgpa double 
// Requirements: 
// 1. Create a parameterized constructor to initialize the attributes. 
// 2. Implement getter and setter methods for all attributes. 
// 3. In setAge(), accept only values between 18 and 30. 
// 4. In setCgpa(), accept only values between 0.0 and 4.0. 
// 5. In setName(), reject null, empty, or whitespace-only names. 
// 6. If invalid data is provided, display an error message and keep the previous value. 
// 7. Create a displayInfo() method that uses getter methods.

class Student {
    private String name;
    private int age;
    private double cgpa;

    Student() {
        this.name = "undefined";
        this.age = 0;
        this.cgpa = 0.0;
    }

    Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("name '" + name + "' is not acceptable");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setage(int age) {
        if (age > 18 && age < 30) {
            this.age = age;
        } else {
            System.out.println("age " + age + " is not acceptable");
        }
    }

    public double getCGPA() {
        return this.cgpa;
    }

    public void setCGPA(double cgpa) {
        if (cgpa > 0.0 && cgpa < 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("CGPA " + cgpa + " is not acceptable");
        }
    }

    public void displayInfo() {
        System.out.println("------Student Info------");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("CGPA: " + getCGPA());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("taqi", 22, 3.55);
        s1.displayInfo();

        Student s2 = new Student();
        s2.setName("rehan");
        s2.setage(24);
        s2.setCGPA(3.88);
        s2.displayInfo();
    }
}