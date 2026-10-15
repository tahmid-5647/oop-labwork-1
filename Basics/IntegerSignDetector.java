// Exercise 16: Integer Sign Detector 
// Problem: 
// Print "positive", "negative", or "zero". 
// Input: 0 
// Output: Zero 


public class IntegerSignDetector {
    int number;

    IntegerSignDetector(int number) {
        this.number = number;
    }

    void detectSign() {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        IntegerSignDetector detector = new IntegerSignDetector(0);
        detector.detectSign();
    }
}