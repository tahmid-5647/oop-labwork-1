// Exercise 3: BankAccount
// • Constructors: 
// 1. Default constructor → balance = 0. 
// 2. Constructor with initial balance. 
// • Method Overloading: 
// o deposit(int amount) 
// o deposit(double amount) 
// • Normal Methods: 
// o withdraw(double amount) 
// o showBalance() → print balance.


public class BankAccount2 {
    double balance;

    BankAccount2() {
        this(0.0);
    }

    BankAccount2(double balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited (int): $" + amount);
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited (double): $" + amount);
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount2 acc1 = new BankAccount2();
        BankAccount2 acc2 = new BankAccount2(1000.0);

        acc1.showBalance();
        acc1.deposit(500);
        acc1.showBalance();

        System.out.println();

        acc2.showBalance();
        acc2.deposit(250.75);
        acc2.withdraw(100.50);
        acc2.showBalance();
    }
}