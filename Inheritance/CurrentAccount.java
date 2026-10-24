// Exercise 5: Bank Account System
// Create a superclass BankAccount with accountNumber, holderName, and balance.
// Create two subclasses: SavingsAccount with interestRate, and CurrentAccount with serviceCharge.
// Requirements:
// 1. All classes must contain parameterized constructors.
// 2. Both subclasses must call the parent constructor using super().
// 3. Define calculateYearEndBalance() in BankAccount, returning the balance.
// 4. Override this method in SavingsAccount to add annual interest.
// 5. Override it in CurrentAccount to subtract the service charge.
// 6. Display the final balance for each account.
// Example: For an initial balance of 10,000, an interest rate of 5%, and a service charge of 200:
// Savings Account Final Balance: 10500.0
// Current Account Final Balance: 9800.0

class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double calculateYearEndBalance() {
        return this.balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateYearEndBalance() {
        return this.balance + (this.balance * (this.interestRate / 100.0));
    }
}

public class CurrentAccount extends BankAccount {
    double serviceCharge;

    CurrentAccount(String accountNumber, String holderName, double balance, double serviceCharge) {
        super(accountNumber, holderName, balance);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateYearEndBalance() {
        return this.balance - this.serviceCharge;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S101", "Rahim", 10000.0, 5.0);
        CurrentAccount current = new CurrentAccount("C101", "Karim", 10000.0, 200.0);

        System.out.println("Savings Account Final Balance: " + savings.calculateYearEndBalance());
        System.out.println("Current Account Final Balance: " + current.calculateYearEndBalance());
    }
}