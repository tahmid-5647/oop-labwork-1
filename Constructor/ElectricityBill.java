// Exercise 11: Electricity Bill 
// Create a class ElectricityBill. 
// Variables: 
// String customerName; 
// int units; 
// Create a constructor. 
// Method 
// double calculateBill() 
// void displayBill() 
// Use these rules: 
// First 100 units  = 5 taka/unit 
// Next 100 units   = 7 taka/unit 
// Above 200 units  = 10 taka/unit 

class ElectricityBill {
    String customerName;
    int units;

    ElectricityBill(String customerName, int units) {
        this.customerName = customerName;
        this.units = units;
    }

    double calculateBill() {
        double bill = 0;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        return bill;
    }

    void displayBill() {
        System.out.println();
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: " + calculateBill() + " taka");
    }

    public static void main(String[] args) {
        ElectricityBill bill1 = new ElectricityBill("taqi", 80);
        bill1.displayBill();
        
        ElectricityBill bill2 = new ElectricityBill("tahmid", 150);
        bill2.displayBill();

        ElectricityBill bill3 = new ElectricityBill("rahim", 250);
        bill3.displayBill();
    }
}