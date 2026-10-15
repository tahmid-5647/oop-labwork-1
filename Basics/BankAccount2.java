// 10. Bank Transaction Tracker 
// • Create a BankAccount class with fields: 
// accountHolder, balance, and transactionHistory (as an array of Strings). 
// • Add methods: 
// o deposit(double amount) → updates balance and stores "Deposited X" in history. 
// o withdraw(double amount) → updates balance if enough funds, else print error. 
// o showHistory() → prints all transaction history.



public class BankAccount2 {
    String accountHolder;
    double balance;
    String[] transactionHistory;
    int transactionCount;

    BankAccount2(String accountHolder, double balance, int capacity) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new String[capacity];
        this.transactionCount = 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            if (transactionCount < transactionHistory.length) {
                transactionHistory[transactionCount++] = "Deposited " + amount;
            }
            System.out.println("Deposited " + amount + " to " + accountHolder + "'s account.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            if (transactionCount < transactionHistory.length) {
                transactionHistory[transactionCount++] = "Withdrew " + amount;
            }
            System.out.println("Withdrew " + amount + " from " + accountHolder + "'s account.");
        } else {
            System.out.println("Error: Insufficient funds or invalid amount for " + accountHolder);
        }
    }

    void showHistory() {
        System.out.println("Transaction History for " + accountHolder + ":");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println("- " + transactionHistory[i]);
        }
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount2 account = new BankAccount2("Bob", 1000.0, 5);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.showHistory();
    }
}