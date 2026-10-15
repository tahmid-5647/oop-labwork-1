// Exercise 3: Bank Account 
// Create a class BankAccount2 with overloaded constructors: 
// 1. No-argument constructor → initializes account with default balance = 0. 
// 2. Constructor with accountNumber. 
// 3. Constructor with accountNumber and balance. 
// 4. Constructor with accountNumber, balance, and accountHolderName.

public class BankAccount2 {
    String accountNumber;
    double balance;
    String accountHolderName;

    BankAccount2() {
        this.accountNumber = "Unknown";
        this.balance = 0.0;
        this.accountHolderName = "Unknown";
    }

    BankAccount2(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.accountHolderName = "Unknown";
    }

    BankAccount2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = "Unknown";
    }

    BankAccount2(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber + " | Balance: $" + balance + " | Holder Name: " + accountHolderName);
    }

    public static void main(String[] args) {
        BankAccount2 acc1 = new BankAccount2();
        BankAccount2 acc2 = new BankAccount2("ACC1001");
        BankAccount2 acc3 = new BankAccount2("ACC1002", 5000.0);
        BankAccount2 acc4 = new BankAccount2("ACC1003", 12500.50, "John Doe");

        acc1.displayDetails();
        acc2.displayDetails();
        acc3.displayDetails();
        acc4.displayDetails();
    }
}