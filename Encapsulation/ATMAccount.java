// Exercise 9: ATM PIN and Account Security
// Create a class named ATMAccount containing private attributes accountNumber, pin, balance, and failedAttempts.
// Requirements:
// 1. Initialize the account using a constructor.
// 2. Do not provide a getter for pin.
// 3. Do not provide a setter for balance.
// 4. Do not provide a setter for failedAttempts.
// 5. Create verifyPin(String enteredPin) to verify the PIN.
// 6. A valid PIN must contain exactly four numeric digits.
// 7. Create changePin(String oldPin, String newPin) to change the PIN after verifying the old PIN.
// 8. After three consecutive failed attempts, block further PIN verification until the account is unlocked through a separately defined administrative method.
// 9. Create withdraw() and deposit() methods with appropriate validation.
// Challenge: Explain why giving a public getPin() method would violate secure encapsulation principles.
// (Explanation: A public getPin() exposes sensitive authentication credentials outside the class, bypassing internal security checks and exposing the PIN to any external code or security vulnerabilities.)

public class ATMAccount {
    private String accountNumber;
    private String pin;
    private double balance;
    private int failedAttempts;
    private boolean isBlocked;

    public ATMAccount(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        if (isValidPin(pin)) {
            this.pin = pin;
        } else {
            this.pin = "0000";
            System.out.println("Error: Invalid initial PIN. Defaulted to 0000.");
        }
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
            System.out.println("Error: Initial balance cannot be negative.");
        }
        this.failedAttempts = 0;
        this.isBlocked = false;
    }

    private boolean isValidPin(String pin) {
        return pin != null && pin.matches("\\d{4}");
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getFailedAttempts() {
        return this.failedAttempts;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public boolean verifyPin(String enteredPin) {
        if (this.isBlocked) {
            System.out.println("Error: Account is blocked due to too many failed attempts. Contact admin to unlock.");
            return false;
        }
        if (isValidPin(enteredPin) && this.pin.equals(enteredPin)) {
            this.failedAttempts = 0;
            System.out.println("PIN verification successful.");
            return true;
        } else {
            this.failedAttempts++;
            System.out.println("Error: Invalid PIN.");
            if (this.failedAttempts >= 3) {
                this.isBlocked = true;
                System.out.println("Security Alert: Account has been blocked after 3 consecutive failed attempts.");
            }
            return false;
        }
    }

    public void changePin(String oldPin, String newPin) {
        if (this.isBlocked) {
            System.out.println("Error: Account is blocked. Cannot change PIN.");
            return;
        }
        if (verifyPin(oldPin)) {
            if (isValidPin(newPin)) {
                this.pin = newPin;
                System.out.println("PIN successfully changed.");
            } else {
                System.out.println("Error: New PIN must be exactly four numeric digits.");
            }
        }
    }

    public void unlockAccount() {
        this.failedAttempts = 0;
        this.isBlocked = false;
        System.out.println("Account has been successfully unlocked by admin.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited " + amount);
            System.out.println("Updated Balance: " + getBalance());
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Successfully withdrew " + amount);
                System.out.println("Updated Balance: " + getBalance());
            } else {
                System.out.println("Error: Insufficient balance. Current balance is " + getBalance());
            }
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("------ATM Account Info------");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Is Blocked: " + isBlocked());
        System.out.println("Failed Attempts: " + getFailedAttempts());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        ATMAccount acc = new ATMAccount("ACC9999", "1234", 10000.0);
        acc.displayInfo();

        acc.verifyPin("0000"); // Fail 1
        acc.verifyPin("1111"); // Fail 2
        acc.verifyPin("2222"); // Fail 3 -> Blocks account
        acc.verifyPin("1234"); // Should fail because blocked

        acc.unlockAccount(); // Admin unlock
        acc.verifyPin("1234"); // Success
        acc.changePin("1234", "5678");
        acc.deposit(2000.0);
        acc.withdraw(5000.0);
        acc.displayInfo();
    }
}