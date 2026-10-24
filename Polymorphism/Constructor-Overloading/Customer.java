// Exercise 8: Customer Bill 
// Create a class Customer. 
// Variables: 
// String name; 
// int customerId; 
// double purchaseAmount; 
// Constructor overloading: 
// Customer(String name) 
// Customer(String name, int customerId) 
// Customer(String name, int customerId, double purchaseAmount) 
// Create overloaded calculateBill() methods: 
// double calculateBill() 
// double calculateBill(double discount) 
// double calculateBill(double discount, double tax)


public class Customer {
    String name;
    int customerId;
    double purchaseAmount;

    Customer(String name) {
        this.name = name;
        this.customerId = 0;
        this.purchaseAmount = 0.0;
    }

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.purchaseAmount = 0.0;
    }

    Customer(String name, int customerId, double purchaseAmount) {
        this.name = name;
        this.customerId = customerId;
        this.purchaseAmount = purchaseAmount;
    }

    double calculateBill() {
        return purchaseAmount;
    }

    double calculateBill(double discount) {
        return purchaseAmount - (purchaseAmount * (discount / 100));
    }

    double calculateBill(double discount, double tax) {
        double discountedAmount = purchaseAmount - (purchaseAmount * (discount / 100));
        return discountedAmount + (discountedAmount * (tax / 100));
    }

    void displayCustomer() {
        System.out.println();
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Purchase Amount: " + purchaseAmount);
    }
    public static void main(String[] args) {
        Customer c1 = new Customer("taqi");
        Customer c2 = new Customer("tahmid", 101);
        Customer c3 = new Customer("rahim", 102, 5000);

        c1.displayCustomer();
        System.out.println("Total Bill: " + c1.calculateBill());

        c2.displayCustomer();
        System.out.println("Total Bill: " + c2.calculateBill());

        c3.displayCustomer();
        System.out.println("Total Bill (No discount/tax): " + c3.calculateBill());
        System.out.println("Total Bill (10% discount): " + c3.calculateBill(10));
        System.out.println("Total Bill (10% discount + 5% tax): " + c3.calculateBill(10, 5));
    }
}