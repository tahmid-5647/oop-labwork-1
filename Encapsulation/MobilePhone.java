// Exercise 6: Mobile Phone Battery Management
// Create a class named MobilePhone containing private attributes brand, model, batteryPercentage, and isPoweredOn.
// Requirements:
// 1. Initialize all attributes using a constructor.
// 2. Provide getter methods for all attributes.
// 3. batteryPercentage must always remain between 0 and 100.
// 4. Do not provide a public setter for the battery percentage.
// 5. Create chargeBattery(int amount) to increase battery percentage without exceeding 100.
// 6. Create useBattery(int amount) to decrease battery percentage without going below zero.
// 7. Create powerOn() and powerOff() methods.
// 8. A phone cannot be powered on when the battery is 0%.

public class MobilePhone {
    private String brand;
    private String model;
    private int batteryPercentage;
    private boolean isPoweredOn;

    public MobilePhone(String brand, String model, int batteryPercentage, boolean isPoweredOn) {
        this.brand = brand;
        this.model = model;
        if (batteryPercentage >= 0 && batteryPercentage <= 100) {
            this.batteryPercentage = batteryPercentage;
        } else {
            this.batteryPercentage = 100;
            System.out.println("Error: Battery percentage must be between 0 and 100.");
        }
        if (isPoweredOn && this.batteryPercentage == 0) {
            this.isPoweredOn = false;
            System.out.println("Error: Cannot power on phone with 0% battery.");
        } else {
            this.isPoweredOn = isPoweredOn;
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public boolean isPoweredOn() {
        return this.isPoweredOn;
    }

    public void chargeBattery(int amount) {
        if (amount > 0) {
            this.batteryPercentage = Math.min(100, this.batteryPercentage + amount);
            System.out.println("Charged by " + amount + "%. Current battery: " + this.batteryPercentage + "%");
        } else {
            System.out.println("Error: Charge amount must be positive.");
        }
    }

    public void useBattery(int amount) {
        if (amount > 0) {
            this.batteryPercentage = Math.max(0, this.batteryPercentage - amount);
            System.out.println("Used battery by " + amount + "%. Current battery: " + this.batteryPercentage + "%");
            if (this.batteryPercentage == 0 && this.isPoweredOn) {
                this.isPoweredOn = false;
                System.out.println("Battery is 0%. Phone has been automatically powered off.");
            }
        } else {
            System.out.println("Error: Use amount must be positive.");
        }
    }

    public void powerOn() {
        if (this.batteryPercentage > 0) {
            if (!this.isPoweredOn) {
                this.isPoweredOn = true;
                System.out.println("Phone is now powered on.");
            } else {
                System.out.println("Phone is already powered on.");
            }
        } else {
            System.out.println("Error: Cannot power on phone. Battery is at 0%.");
        }
    }

    public void powerOff() {
        if (this.isPoweredOn) {
            this.isPoweredOn = false;
            System.out.println("Phone is now powered off.");
        } else {
            System.out.println("Phone is already powered off.");
        }
    }

    public void displayInfo() {
        System.out.println("------Mobile Phone Info------");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Battery Percentage: " + getBatteryPercentage() + "%");
        System.out.println("Powered On: " + isPoweredOn());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Apple", "iPhone 15", 10, false);
        phone.displayInfo();

        phone.powerOn();
        phone.useBattery(10);
        phone.powerOn(); // Should fail because battery is 0%
        phone.chargeBattery(50);
        phone.powerOn();
        phone.displayInfo();
    }
}