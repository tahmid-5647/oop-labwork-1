// Exercise 4: Book 
// Create a class Book with overloaded constructors: 
// 1. Accepts only title. 
// 2. Accepts title and author. 
// 3. Accepts title, author, and price. 
// 4. Accepts title, author, price, and year. 
//  Add a method displayBook() to show details.



public class Book {
    String title;
    String author;
    double price;
    int year;

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
        this.year = 0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
        this.year = 0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = 0;
    }

    Book(String title, String author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    void displayBook() {
        System.out.println("Title: " + title + " | Author: " + author + " | Price: $" + price + " | Year: " + year);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Clean Code", "Robert C. Martin", 45.99);
        Book b4 = new Book("Design Patterns", "Erich Gamma", 54.99, 1994);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
        b4.displayBook();
    }
}