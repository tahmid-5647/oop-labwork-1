// Exercise 15: Challenge — Library Book 
// Create a class LibraryBook. 
// Variables: 
// String title; 
// String author; 
// boolean borrowed; 
// The constructor should initialize: 
// borrowed = false; 
// Methods: 
// void borrowBook() 
// void returnBook() 
// void displayStatus() 
// Rules: 
// • A borrowed book cannot be borrowed again.  
// • A returned book cannot be returned again. 

class LibraryBook {
    String title;
    String author;
    boolean borrowed;

    LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Book Borrowed Successfully");
        } else {
            System.out.println("Book is Already Borrowed");
        }
    }

    void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Book Returned Successfully");
        } else {
            System.out.println("Book was Not Borrowed");
        }
    }

    void displayStatus() {
        System.out.println();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (borrowed) {
            System.out.println("Status: Borrowed");
        } else {
            System.out.println("Status: Available");
        }
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming", "John Doe");

        book1.displayStatus();

        book1.borrowBook();
        book1.displayStatus();

        book1.borrowBook();

        book1.returnBook();
        book1.displayStatus();

        book1.returnBook();
    }
}