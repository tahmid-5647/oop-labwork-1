// Exercise 11: Electricity Billing System
// Create a class named ElectricityAccount containing private attributes meterNumber, customerName, previousReading, and currentReading.
// Requirements:
// 1. Initialize all attributes using a constructor.
// 2. Make meterNumber read-only.
// 3. Provide getters for all attributes.
// 4. Validate customerName using a setter.
// 5. Create setCurrentReading(double reading) with validation so that the new reading cannot be lower than the previous reading.
// 6. Do not provide a public setter for previousReading.
// 7. Create calculateBill() using the specified rates.
// 8. Create startNewBillingCycle() to save the current reading as the previous reading.
// Challenge: Ensure the bill cannot become negative, even when invalid input is attempted.

public class ElectricityAccount {
    private String meterNumber;
    private String customerName;
    private double previousReading;
    private double currentReading;

    public ElectricityAccount(String meterNumber, String customerName, double previousReading, double currentReading) {
        this.meterNumber = meterNumber;
        setCustomerName(customerName);
        if (previousReading >= 0) {
            this.previousReading = previousReading;
        } else {
            this.previousReading = 0.0;
            System.out.println("Error: Previous reading cannot be negative.");
        }
        if (currentReading >= this.previousReading) {
            this.currentReading = currentReading;
        } else {
            this.currentReading = this.previousReading;
            System.out.println("Error: Current reading cannot be lower than previous reading.");
        }
    }

    public String getMeterNumber() {
        return this.meterNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName != null && !customerName.isBlank()) {
            this.customerName = customerName;
        } else {
            System.out.println("Error: Customer name cannot be null, empty, or whitespace-only.");
        }
    }

    public double getPreviousReading() {
        return this.previousReading;
    }

    public double getCurrentReading() {
        return this.currentReading;
    }

    public void setCurrentReading(double reading) {
        if (reading >= this.previousReading) {
            this.currentReading = reading;
        } else {
            System.out.println("Error: Current reading cannot be lower than previous reading (" + this.previousReading + ").");
        }
    }

    public double calculateBill() {
        double units = this.currentReading - this.previousReading;
        if (units < 0) {
            return 0.0;
        }

        double bill = 0.0;
        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }
        return bill;
    }

    public void startNewBillingCycle() {
        this.previousReading = this.currentReading;
        System.out.println("New billing cycle started. Previous reading updated to: " + this.previousReading);
    }

    public void displayInfo() {
        System.out.println("------Electricity Account Info------");
        System.out.println("Meter Number: " + getMeterNumber());
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Previous Reading: " + getPreviousReading());
        System.out.println("Current Reading: " + getCurrentReading());
        System.out.println("Units Consumed: " + Math.max(0, getCurrentReading() - getPreviousReading()));
        System.out.println("Total Bill: " + calculateBill());
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        ElectricityAccount acc = new ElectricityAccount("M12345", "Alice Smith", 1000.0, 1250.0);
        acc.displayInfo();

        acc.setCurrentReading(900.0); // Should fail validation
        acc.setCurrentReading(1350.0); // Should succeed
        acc.displayInfo();

        acc.startNewBillingCycle();
        acc.setCurrentReading(1500.0); // Should succeed
        acc.displayInfo();
    }
}