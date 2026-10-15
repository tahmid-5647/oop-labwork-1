// 3.  Bank Account 
// • Create a BankAccount class with: 
// o Attributes: accountNumber, balance. 
// o Methods: deposit(), withdraw(), and displayBalance(). 
// • In main, create two BankAccount objects and transfer money between them.


public class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to " + accountNumber);
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from " + accountNumber);
        } else {
            System.out.println("Insufficient funds or invalid amount for " + accountNumber);
        }
    }

    void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }

    void transfer(BankAccount targetAccount, double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            targetAccount.balance += amount;
            System.out.println("Transferred " + amount + " from " + this.accountNumber + " to " + targetAccount.accountNumber);
        } else {
            System.out.println("Transfer failed from " + this.accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC101", 5000.0);
        BankAccount acc2 = new BankAccount("ACC102", 2000.0);

        acc1.displayBalance();
        acc2.displayBalance();

        acc1.transfer(acc2, 1500.0);

        acc1.displayBalance();
        acc2.displayBalance();
    }
}