// Create a class BankAccount.
// Variables:
// String accountName;
// String accountNumber;
// double balance;
// Constructor overloading:
// BankAccount(String accountName)
// BankAccount(String accountName, String accountNumber)
// BankAccount(String accountName, String accountNumber, double balance)
// Create overloaded deposit() methods:
// void deposit(double amount)
// void deposit(double amount, String description)
// void deposit(double amount, String description, int transactionId)

public class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    BankAccount(String accountName) {
        this.accountName = accountName;
    }

    BankAccount(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    BankAccount(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount >= 0) {
            this.balance = this.balance + amount;
            System.out.println("deposit successfull");
            System.out.println("current balance: " + this.balance);
        } else {
            System.out.println("deposit unsuccessfull");
        }
    }

    void deposit(double amount, String description) {
        if (amount >= 0) {
            this.balance = this.balance + amount;
            System.out.println("deposit successfull");
            System.out.println(description);
            System.out.println("current balance: " + this.balance);
        } else {
            System.out.println("deposit unsuccessfull");
        }
    }

    void deposit(double amount, String description, int transactionId) {
        if (amount >= 0) {
            this.balance = this.balance + amount;
            System.out.println("deposit successfull");
            System.out.println(description);
            System.out.println("transaction id: " + transactionId);
            System.out.println("current balance: " + this.balance);
        } else {
            System.out.println("deposit unsuccessfull");
        }
    }

    public static void main(String[] args) {
        System.out.println();
        BankAccount acc1 = new BankAccount("rahim");
        acc1.deposit(1000000);
        
        System.out.println();
        BankAccount acc2 = new BankAccount("shafin", "44526327");
        acc2.deposit(7, "biri khabo");
        
        System.out.println();
        BankAccount acc3 = new BankAccount("rehan", "26732048", 20000);
        acc3.deposit(100, "panjabi kinbo", 3246);
    }

}