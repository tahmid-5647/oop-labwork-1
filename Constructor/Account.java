// Exercise 14: Account with Constructor Validation 
// Create a class Account. 
// Variables: 
// String accountNumber; 
// String holderName; 
// double balance; 
// The constructor should make sure that the initial balance is not negative. 
// Methods: 
// void deposit(double amount) 
// boolean withdraw(double amount) 
// void displayAccount() 

class Account {
    String accountNumber;
    String holderName;
    double balance;

    Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if (balance < 0) {
            this.balance = 0.0;
            System.out.println("Initial balance cannot be negative. Set to 0.0");
        } else {
            this.balance = balance;
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw Successful");
            return true;
        } else {
            System.out.println("Insufficient Balance");
            return false;
        }
    }

    void displayAccount() {
        System.out.println();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account("ACC-101", "taqi", 20000);
        acc1.displayAccount();

        Account acc2 = new Account("ACC-102", "tahmid", -5000);
        acc2.displayAccount();

        acc1.deposit(5000);
        boolean success = acc1.withdraw(10000);
        System.out.println("Withdraw Status: " + success);

        acc1.displayAccount();
    }
}
// public class AccountMain {
// }