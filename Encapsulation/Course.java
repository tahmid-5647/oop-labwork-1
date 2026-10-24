// Exercise 5: University Course Registration System
// Create a class named Course with the following private attributes:
// courseCode (Cannot be changed after initialization)
// courseTitle (Cannot be empty)
// credit (Must be between 1 and 4)
// enrolledStudents (Must not be negative)
// maximumCapacity (Must be greater than zero)
// Requirements:
// 1. Create a parameterized constructor.
// 2. Provide appropriate getters.
// 3. Implement setters only for attributes that should be directly modifiable.
// 4. Implement setCredit() with range validation.
// 5. Implement setCourseTitle() with non-empty validation.
// 6. Do not provide a public setter for enrolledStudents.
// 7. Create enrollStudent() that increments enrollment only if space is available.
// 8. Create dropStudent() that decrements enrollment only if at least one student is enrolled.
// 9. Prevent reducing maximumCapacity below the number of currently enrolled students.

public class Course {
    private String courseCode;
    private String courseTitle;
    private int credit;
    private int enrolledStudents;
    private int maximumCapacity;

    public Course(String courseCode, String courseTitle, int credit, int enrolledStudents, int maximumCapacity) {
        this.courseCode = courseCode;
        setCourseTitle(courseTitle);
        setCredit(credit);
        if (maximumCapacity > 0) {
            this.maximumCapacity = maximumCapacity;
        } else {
            this.maximumCapacity = 10;
            System.out.println("Error: Maximum capacity must be greater than zero.");
        }
        if (enrolledStudents >= 0 && enrolledStudents <= this.maximumCapacity) {
            this.enrolledStudents = enrolledStudents;
        } else {
            this.enrolledStudents = 0;
            System.out.println("Error: Invalid initial enrolled students.");
        }
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        if (courseTitle != null && !courseTitle.isBlank()) {
            this.courseTitle = courseTitle;
        } else {
            System.out.println("Error: Course title cannot be null, empty, or whitespace-only.");
        }
    }

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) {
        if (credit >= 1 && credit <= 4) {
            this.credit = credit;
        } else {
            System.out.println("Error: Credit must be between 1 and 4.");
        }
    }

    public int getEnrolledStudents() {
        return this.enrolledStudents;
    }

    public int getMaximumCapacity() {
        return this.maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        if (maximumCapacity > 0) {
            if (maximumCapacity >= this.enrolledStudents) {
                this.maximumCapacity = maximumCapacity;
                System.out.println("Maximum capacity successfully updated to " + maximumCapacity);
            } else {
                System.out.println("Error: Cannot reduce maximum capacity below currently enrolled students (" + this.enrolledStudents + ").");
            }
        } else {
            System.out.println("Error: Maximum capacity must be greater than zero.");
        }
    }

    public void enrollStudent() {
        if (this.enrolledStudents < this.maximumCapacity) {
            this.enrolledStudents++;
            System.out.println("Student enrolled successfully. Total enrolled: " + this.enrolledStudents);
        } else {
            System.out.println("Error: Course is at full capacity (" + this.maximumCapacity + ").");
        }
    }

    public void dropStudent() {
        if (this.enrolledStudents > 0) {
            this.enrolledStudents--;
            System.out.println("Student dropped successfully. Total enrolled: " + this.enrolledStudents);
        } else {
            System.out.println("Error: No students are currently enrolled in this course.");
        }
    }

    public void displayInfo() {
        System.out.println("------Course Info------");
        System.out.println("Course Code: " + getCourseCode());
        System.out.println("Course Title: " + getCourseTitle());
        System.out.println("Credit: " + getCredit());
        System.out.println("Enrolled Students: " + getEnrolledStudents());
        System.out.println("Maximum Capacity: " + getMaximumCapacity());
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Course c = new Course("CSE110", "Programming Fundamentals", 3, 5, 10);
        c.displayInfo();

        c.enrollStudent();
        c.dropStudent();
        c.setMaximumCapacity(4); // Should fail because 5 students are currently enrolled
        c.setMaximumCapacity(15); // Should succeed
        c.displayInfo();
    }
}