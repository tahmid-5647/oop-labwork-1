// Exercise 7: Online Shopping Customer Account
// Create a class named Customer with private attributes customerId, name, email, phoneNumber, and walletBalance.
// Requirements:
// 1. Initialize attributes using a constructor.
// 2. Provide getter methods for all attributes except where exposing data is unnecessary.
// 3. Do not provide a setter for customerId.
// 4. Validate name so that it is not blank.
// 5. Validate email so that it contains @ and a . after @.
// 6. Validate phoneNumber so that it contains exactly 11 digits.
// 7. Do not provide a public setter for walletBalance.
// 8. Create addMoney() and makePayment() methods that perform appropriate balance checks.
// 9. Ensure invalid setter inputs do not modify existing data.
// Challenge: Prevent external code from directly modifying the wallet balance.

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private double walletBalance;

    public Customer(String customerId, String name, String email, String phoneNumber, double walletBalance) {
        this.customerId = customerId;
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        if (walletBalance >= 0) {
            this.walletBalance = walletBalance;
        } else {
            this.walletBalance = 0.0;
            System.out.println("Error: Initial wallet balance cannot be negative.");
        }
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be null, empty, or whitespace-only.");
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email != null) {
            int atIndex = email.indexOf('@');
            int dotIndex = email.indexOf('.', atIndex);
            if (atIndex > 0 && dotIndex != -1 && dotIndex > atIndex + 1) {
                this.email = email;
                return;
            }
        }
        System.out.println("Error: Invalid email. Must contain '@' and a '.' after '@'.");
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\d{11}")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Error: Phone number must contain exactly 11 digits.");
        }
    }

    public double getWalletBalance() {
        return this.walletBalance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.walletBalance += amount;
            System.out.println("Successfully added " + amount + " to wallet.");
            System.out.println("Updated Wallet Balance: " + getWalletBalance());
        } else {
            System.out.println("Error: Amount to add must be positive.");
        }
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            if (this.walletBalance >= amount) {
                this.walletBalance -= amount;
                System.out.println("Successfully made payment of " + amount);
                System.out.println("Updated Wallet Balance: " + getWalletBalance());
            } else {
                System.out.println("Error: Insufficient wallet balance. Current balance is " + getWalletBalance());
            }
        } else {
            System.out.println("Error: Payment amount must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("------Customer Info------");
        System.out.println("Customer ID: " + getCustomerId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Wallet Balance: " + getWalletBalance());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Customer c = new Customer("C001", "Jane Doe", "jane.doe@example.com", "01234567890", 500.0);
        c.displayInfo();

        c.addMoney(200.0);
        c.makePayment(150.0);
        c.makePayment(1000.0); // Should fail due to insufficient balance
        c.setEmail("invalid-email"); // Should fail validation
        c.setPhoneNumber("12345"); // Should fail validation
        c.displayInfo();
    }
}