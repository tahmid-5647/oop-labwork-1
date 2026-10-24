// Exercise 6: Print Different Data Types 
// Create overloaded methods named print() that accept: 
// print(int number); 
// print(double number); 
// print(String text); 
// print(boolean value); 
 
// Example: 
// print(100); 
// print(45.67); 
// print("Java"); 
// print(true);

public class Printer {
    void print(int number) {
        System.out.println("Integer: " + number);
    }

    void print(double number) {
        System.out.println("Double: " + number);
    }

    void print(String text) {
        System.out.println("String: " + text);
    }

    void print(boolean value) {
        System.out.println("Boolean: " + value);
    }

    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(100);
        p.print(45.67);
        p.print("Java");
        p.print(true);
    }
}