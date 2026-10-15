// Exercise 5: Bank Interest Calculator 
// Create a class Bank with overloaded methods calculateInterest: 
// 1. Accepts principal and time (assume fixed rate). 
// 2. Accepts principal, time, and rate. 
// 3. Accepts principal, time, rate, and compounding frequency (compound interest).

public class Bank {
    double calculateInterest(double principal, double time) {
        double defaultRate = 5.0;
        return (principal * time * defaultRate) / 100;
    }

    double calculateInterest(double principal, double time, double rate) {
        return (principal * time * rate) / 100;
    }

    double calculateInterest(double principal, double time, double rate, int frequency) {
        return principal * Math.pow(1 + (rate / (100 * frequency)), frequency * time) - principal;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        double simpleInterestDefault = bank.calculateInterest(10000.0, 2.0);
        System.out.println("Simple Interest (Default Rate): " + simpleInterestDefault);

        double simpleInterestCustom = bank.calculateInterest(10000.0, 2.0, 7.5);
        System.out.println("Simple Interest (Custom Rate): " + simpleInterestCustom);

        double compoundInterest = bank.calculateInterest(10000.0, 2.0, 7.5, 4);
        System.out.println("Compound Interest (Quarterly): " + compoundInterest);
    }
}