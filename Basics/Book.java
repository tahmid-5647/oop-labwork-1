// 4. Book Information 
// • Create a Book class with fields: title, author, price. 
// • In the main method, create three Book objects and assign values directly. 
// • Display all book details using a method showBook(). 



public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void showBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.50);
        Book book3 = new Book("1984", "George Orwell", 10.99);

        book1.showBook();
        book2.showBook();
        book3.showBook();
    }
}