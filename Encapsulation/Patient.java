// Exercise 8: Hospital Patient Record
// Create a class named Patient with private attributes patientId, patientName, age, bloodGroup, and medicalBill.
// Requirements:
// 1. Create a parameterized constructor.
// 2. Provide getters for all attributes.
// 3. Do not provide a setter for patientId.
// 4. Validate age within the range 0–120.
// 5. Validate bloodGroup against the accepted values: A+, A-, B+, B-, AB+, AB-, O+, and O-.
// 6. Allow patient name changes only when the new name is not blank.
// 7. Do not provide a direct public setter for medicalBill.
// 8. Create addMedicalCharge(double amount) to add positive charges.
// 9. Create makePayment(double amount) to reduce the outstanding bill without allowing overpayment.

public class Patient {
    private String patientId;
    private String patientName;
    private int age;
    private String bloodGroup;
    private double medicalBill;

    public Patient(String patientId, String patientName, int age, String bloodGroup, double medicalBill) {
        this.patientId = patientId;
        setPatientName(patientName);
        setAge(age);
        setBloodGroup(bloodGroup);
        if (medicalBill >= 0) {
            this.medicalBill = medicalBill;
        } else {
            this.medicalBill = 0.0;
            System.out.println("Error: Initial medical bill cannot be negative.");
        }
    }

    public String getPatientId() {
        return this.patientId;
    }

    public String getPatientName() {
        return this.patientName;
    }

    public void setPatientName(String patientName) {
        if (patientName != null && !patientName.isBlank()) {
            this.patientName = patientName;
        } else {
            System.out.println("Error: Patient name cannot be null, empty, or whitespace-only.");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 0 and 120.");
        }
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        if (bloodGroup != null && (bloodGroup.equals("A+") || bloodGroup.equals("A-") || 
                                   bloodGroup.equals("B+") || bloodGroup.equals("B-") || 
                                   bloodGroup.equals("AB+") || bloodGroup.equals("AB-") || 
                                   bloodGroup.equals("O+") || bloodGroup.equals("O-"))) {
            this.bloodGroup = bloodGroup;
        } else {
            System.out.println("Error: Invalid blood group. Accepted values are A+, A-, B+, B-, AB+, AB-, O+, O-.");
        }
    }

    public double getMedicalBill() {
        return this.medicalBill;
    }

    public void addMedicalCharge(double amount) {
        if (amount > 0) {
            this.medicalBill += amount;
            System.out.println("Successfully added charge of " + amount);
            System.out.println("Updated Medical Bill: " + getMedicalBill());
        } else {
            System.out.println("Error: Charge amount must be positive.");
        }
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            if (this.medicalBill >= amount) {
                this.medicalBill -= amount;
                System.out.println("Successfully paid " + amount);
                System.out.println("Updated Medical Bill: " + getMedicalBill());
            } else {
                System.out.println("Error: Overpayment not allowed. Current bill is " + getMedicalBill() + ", but payment requested was " + amount + ".");
            }
        } else {
            System.out.println("Error: Payment amount must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("------Patient Info------");
        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Age: " + getAge());
        System.out.println("Blood Group: " + getBloodGroup());
        System.out.println("Medical Bill: " + getMedicalBill());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Patient p = new Patient("P1001", "John Smith", 45, "O+", 1500.0);
        p.displayInfo();

        p.addMedicalCharge(300.0);
        p.makePayment(500.0);
        p.makePayment(2000.0); // Should fail due to overpayment
        p.setAge(130); // Should fail validation
        p.setBloodGroup("X+"); // Should fail validation
        p.displayInfo();
    }
}