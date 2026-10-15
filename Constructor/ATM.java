// Exercise 16: Challenge — ATM Account 
// Create a class ATM. 
// Variables: 
// String name; 
// int pin; 
// double balance; 
// Create a constructor. 
// Methods: 
// boolean verifyPin(int enteredPin) 
// void deposit(double amount) 
// void withdraw(double amount, int enteredPin) 
// void checkBalance(int enteredPin) 
// The withdrawal and balance-check methods should only work when the PIN is correct.

class ATM {
    String name;
    int pin;
    double balance;

    ATM(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit Successful");
    }

    void withdraw(double amount, int enteredPin) {
        if (!verifyPin(enteredPin)) {
            System.out.println("Incorrect PIN");
        } else if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance(int enteredPin) {
        if (verifyPin(enteredPin)) {
            System.out.println();
            System.out.println("Account Holder: " + name);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Incorrect PIN");
        }
    }
    public static void main(String[] args) {
        ATM acc1 = new ATM("taqi", 1234, 20000);

        acc1.deposit(5000);

        acc1.checkBalance(9999);
        acc1.withdraw(2000, 9999);

        acc1.checkBalance(1234);
        acc1.withdraw(2000, 1234);
        acc1.checkBalance(1234);
    }
}