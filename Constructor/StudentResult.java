// Exercise 12: Student Result 
// Create a class StudentResult. 
// Variables: 
// String name; 
// double marks1; 
// double marks2; 
// double marks3; 
// Create a constructor. 
// Methods: 
// double calculateAverage() 
// String getGrade() 
// void displayResult() 
// Grade system: 
// 80–100 = A+ 
// 70–79  = A 
// 60–69  = A- 
// 50–59  = B 
// 40–49  = C 
// Below 40 = F 

class StudentResult {
    String name;
    double marks1;
    double marks2;
    double marks3;

    StudentResult(String name, double marks1, double marks2, double marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    double calculateAverage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    String getGrade() {
        double avg = calculateAverage();

        if (avg >= 80) {
            return "A+";
        } else if (avg >= 70) {
            return "A";
        } else if (avg >= 60) {
            return "A-";
        } else if (avg >= 50) {
            return "B";
        } else if (avg >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    void displayResult() {
        System.out.println();
        System.out.println("Student Name: " + name);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        StudentResult student1 = new StudentResult("taqi", 85, 90, 82);
        StudentResult student2 = new StudentResult("tahmid", 65, 72, 68);
        StudentResult student3 = new StudentResult("rahim", 35, 42, 38);

        student1.displayResult();
        student2.displayResult();
        student3.displayResult();
    }
}