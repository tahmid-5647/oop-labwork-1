// 15. Employee Attendance 
// • Create an Employee class with fields: name, id, daysPresent, totalWorkingDays. 
// • Add methods: 
// o markAttendance(int days) → increases daysPresent. 
// o attendancePercentage() → returns (daysPresent / totalWorkingDays) * 100. 
// • In main, create two employees, update attendance for a month, and display percentage.



public class Employee2 {
    String name;
    int id;
    int daysPresent;
    int totalWorkingDays;

    Employee2(String name, int id, int daysPresent, int totalWorkingDays) {
        this.name = name;
        this.id = id;
        this.daysPresent = daysPresent;
        this.totalWorkingDays = totalWorkingDays;
    }

    void markAttendance(int days) {
        if (days > 0 && (daysPresent + days) <= totalWorkingDays) {
            daysPresent += days;
            System.out.println(name + "'s attendance increased by " + days + " days.");
        } else {
            System.out.println("Invalid days specified for " + name);
        }
    }

    double attendancePercentage() {
        return ((double) daysPresent / totalWorkingDays) * 100.0;
    }

    void displayInfo() {
        System.out.println("Employee2: " + name + " (ID: " + id + ")");
        System.out.println("Days Present: " + daysPresent + "/" + totalWorkingDays);
        System.out.println("Attendance Percentage: " + attendancePercentage() + "%");
        System.out.println();
    }

    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("Alice", 101, 18, 22);
        Employee2 emp2 = new Employee2("Bob", 102, 15, 22);

        emp1.markAttendance(2);
        emp2.markAttendance(4);

        emp1.displayInfo();
        emp2.displayInfo();
    }
}