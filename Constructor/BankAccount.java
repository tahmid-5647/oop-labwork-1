// Exercise 4: Bank Account
// Create a class BankAccount.
// Variables:
// String accountHolder;
// double balance;
// Create a constructor to initialize them.
// Add methods:
// void deposit(double amount)
// void withdraw(double amount)
// void checkBalance()
// b1.checkBalance();
// Make sure the user cannot withdraw more money than the current balance.


class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposit Successfull");
    }

    void withdraw(int amount) {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Withdraw Successfull");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println();
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("taqi", 20000);
        BankAccount acc2 = new BankAccount("tahmid", 45000);

        acc1.checkBalance();
        acc2.checkBalance();
    }
}
