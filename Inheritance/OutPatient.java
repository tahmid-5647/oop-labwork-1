// Exercise 10: Hospital Billing System
// Create a superclass Patient containing patientId, name, and consultationFee. Create two subclasses: InPatient and OutPatient.
// Additional attributes: InPatient (daysAdmitted, dailyRoomCharge), OutPatient (testCharge)
// Requirements:
// 1. Create constructors for all three classes.
// 2. Both subclasses must invoke the superclass constructor using super().
// 3. Define calculateBill() in Patient, returning the consultation fee.
// 4. Override calculateBill() in InPatient to add room charges.
// 5. Override calculateBill() in OutPatient to add test charges.
// 6. Override displayBill() in the subclasses, reusing the superclass method where appropriate.
// 7. Create several patient objects and display their bills.
// 8. Demonstrate runtime polymorphism using an array of Patient references.
// Challenge: Identify which overridden method executes when a parent reference points to a child object.
// (Answer: Dynamic Method Dispatch executes the specific subclass's overridden calculateBill() and displayBill() methods at runtime based on the actual object type.)

class Patient {
    String patientId;
    String name;
    double consultationFee;

    Patient(String patientId, String name, double consultationFee) {
        this.patientId = patientId;
        this.name = name;
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return this.consultationFee;
    }

    public void displayBill() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Total Bill: " + calculateBill());
    }
}

class InPatient extends Patient {
    int daysAdmitted;
    double dailyRoomCharge;

    InPatient(String patientId, String name, double consultationFee, int daysAdmitted, double dailyRoomCharge) {
        super(patientId, name, consultationFee);
        this.daysAdmitted = daysAdmitted;
        this.dailyRoomCharge = dailyRoomCharge;
    }

    @Override
    public double calculateBill() {
        return super.calculateBill() + (this.daysAdmitted * this.dailyRoomCharge);
    }

    @Override
    public void displayBill() {
        System.out.println("------InPatient Bill------");
        super.displayBill();
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Room Charge: " + dailyRoomCharge);
        System.out.println("--------------------------");
    }
}

public class OutPatient extends Patient {
    double testCharge;

    OutPatient(String patientId, String name, double consultationFee, double testCharge) {
        super(patientId, name, consultationFee);
        this.testCharge = testCharge;
    }

    @Override
    public double calculateBill() {
        return super.calculateBill() + this.testCharge;
    }

    @Override
    public void displayBill() {
        System.out.println("------OutPatient Bill------");
        super.displayBill();
        System.out.println("Test Charge: " + testCharge);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Patient[] patients = new Patient[2];
        patients[0] = new InPatient("P101", "John Doe", 500.0, 5, 2000.0);
        patients[1] = new OutPatient("P102", "Jane Smith", 500.0, 1200.0);

        for (Patient p : patients) {
            p.displayBill();
            System.out.println();
        }
    }
}