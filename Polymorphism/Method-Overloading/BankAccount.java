// Exercise 8: Simple Bank Deposit 
// Create a class BankAccount with overloaded deposit() methods: 
// deposit(double amount); 
// deposit(double amount, String description); 
// deposit(double amount, String description, int transactionId); 
// Print appropriate transaction information from each method. 

public class BankAccount {
    void deposit(double amount) {
        System.out.println("Deposited Amount: " + amount);
    }

    void deposit(double amount, String description) {
        System.out.println("Deposited Amount: " + amount + " | Description: " + description);
    }

    void deposit(double amount, String description, int transactionId) {
        System.out.println("Deposited Amount: " + amount + " | Description: " + description + " | Transaction ID: " + transactionId);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000.0);
        account.deposit(2500.0, "Salary");
        account.deposit(10000.0, "Online Transfer", 987654);
    }
}