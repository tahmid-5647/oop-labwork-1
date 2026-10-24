// Exercise 2: Bank Account Balance Protection
// Create a Java class named BankAccount with private attributes accountNumber, accountHolder, and balance.
// Requirements:
// 1. Initialize all attributes using a constructor.
// 2. Provide getter methods for all attributes.
// 3. Provide a setter for accountHolder with validation to reject empty names.
// 4. Do not provide a public setter for accountNumber or balance.
// 5. Create a deposit(double amount) method that accepts only positive amounts.
// 6. Create a withdraw(double amount) method that checks whether the amount is positive and the balance is sufficient.
// 7. Display the updated balance using getBalance().

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        setAccountHolder(accountHolder);
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
            System.out.println("Error: Initial balance cannot be negative.");
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.isBlank()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: Account holder name cannot be null, empty, or whitespace-only.");
        }
    }

    public double getBalance() {
        return this.balance;
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
        System.out.println("------Account Info------");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC1001", "Alice Smith", 5000.0);
        acc.displayInfo();

        acc.deposit(1500.0);
        acc.withdraw(2000.0);
        acc.withdraw(6000.0);
    }
}