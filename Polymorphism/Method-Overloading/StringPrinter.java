// Exercise 3: String Repeater 
// Create a class StringPrinter with an overloaded method print that: 
// 1. Prints a string once. 
// 2. Prints a string multiple times (accept string and count). 
// 3. Prints a string in uppercase (accept string and a boolean flag).

public class StringPrinter {
    void print(String text) {
        System.out.println(text);
    }

    void print(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    void print(String text, boolean toUppercase) {
        if (toUppercase) {
            System.out.println(text.toUpperCase());
        } else {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        StringPrinter printer = new StringPrinter();

        printer.print("Hello Java");
        printer.print("Repeat", 3);
        printer.print("uppercase test", true);
    }
}