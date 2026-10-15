// Variables:
// String name;
// int age;
// double cgpa;
// Create a constructor to initialize all variables.
// Add a method:
// void displayInfo()

class Student {
    String name;
    int age;
    double cgpa;

    Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println();
        System.out.println("Student Info:");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("cgpa: " + cgpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student("arafat", 20, 4.00);
        s1.display();
    }
}