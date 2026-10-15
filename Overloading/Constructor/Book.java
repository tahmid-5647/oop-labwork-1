// Exercise 6: Book 
// Create a class Book. 
// Variables: 
// String title; 
// String author; 
// double price; 
// Constructor overloading: 
// Book(String title) 
// Book(String title, String author) 
// Book(String title, String author, double price) 
// Method overloading: 
// void discount(double percentage) 
// void discount(double percentage, double extraDiscount) 
// void discount(int fixedAmount) 
// Requirements: 
// • First method applies percentage discount.  
// • Second method applies percentage + extra discount.  
// • Third method deducts a fixed amount. 

public class Book {
    String title;
    String author;
    double price;

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void discount(double percentage) {
        price = price - (price * (percentage / 100));
        System.out.println("Percentage Discount Applied Successfully");
    }

    void discount(double percentage, double extraDiscount) {
        double discountedPrice = price - (price * (percentage / 100));
        price = discountedPrice - extraDiscount;
        if (price < 0) {
            price = 0;
        }
        System.out.println("Percentage and Extra Discount Applied Successfully");
    }

    void discount(int fixedAmount) {
        price = price - fixedAmount;
        if (price < 0) {
            price = 0;
        }
        System.out.println("Fixed Amount Discount Applied Successfully");
    }

    void displayBook() {
        System.out.println();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming");
        Book b2 = new Book("Data Structures", "Jane Smith");
        Book b3 = new Book("Algorithms", "John Doe", 1500);

        b1.displayBook();

        b2.displayBook();

        b3.displayBook();

        b3.discount(10.0);
        b3.displayBook();

        b3.discount(10.0, 50.0);
        b3.displayBook();

        b3.discount(100);
        b3.displayBook();
    }
}