// Exercise 19: Temperature Checker 
// Problem: 
// Print “Hot”, “Warm”, or “Cold” based on Celsius value: 
// • ≥30 = Hot 
// • 20–29 = Warm 
// • <20 = Cold 
// Input: 15 
// Output: Cold


public class TemperatureChecker {
    int celsius;

    TemperatureChecker(int celsius) {
        this.celsius = celsius;
    }

    void checkTemperature() {
        if (celsius >= 30) {
            System.out.println("Hot");
        } else if (celsius >= 20 && celsius <= 29) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }

    public static void main(String[] args) {
        TemperatureChecker checker = new TemperatureChecker(15);
        checker.checkTemperature();
    }
}