// Exercise 8: Book 
// Create a class Book. 
// Variables: 
// String title; 
// String author; 
// double price; 
// Create a constructor. 
// Add methods: 
// void displayBook() 
// void discountPrice(double discount) 
// boolean isExpensive() 
// isExpensive() should return true if the book price is greater than 1000.


public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBook() {
        System.out.println();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void discountPrice(double discount) {
        price = price - (price * (discount / 100));
        System.out.println("Discount Applied Successfully");
    }

    public boolean isExpensive() {
        if (price > 1000) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe", 1200);
        Book book2 = new Book("Data Structures", "Jane Smith", 850);

        book1.displayBook();
        System.out.println("Is Expensive: " + book1.isExpensive());

        book2.displayBook();
        System.out.println("Is Expensive: " + book2.isExpensive());

        book1.discountPrice(10);
        book1.displayBook();
        System.out.println("Is Expensive (After Discount): " + book1.isExpensive());
    }
}