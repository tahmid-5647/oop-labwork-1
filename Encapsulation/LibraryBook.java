// Exercise 10: Library Book Borrowing System
// Create a class named LibraryBook containing bookId, title, author, totalCopies, and availableCopies.
// Requirements:
// 1. Declare all attributes as private.
// 2. Initialize them using a constructor.
// 3. Provide getter methods for all attributes.
// 4. Do not provide setters for bookId, totalCopies, or availableCopies.
// 5. Allow title and author to be modified using validated setters.
// 6. Create borrowBook() to decrease available copies.
// 7. Create returnBook() to increase available copies.
// 8. Ensure available copies never exceed total copies and never become negative.
// 9. Reject borrow requests when no copies are available.

public class LibraryBook {
    private String bookId;
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;

    public LibraryBook(String bookId, String title, String author, int totalCopies, int availableCopies) {
        this.bookId = bookId;
        setTitle(title);
        setAuthor(author);
        if (totalCopies > 0) {
            this.totalCopies = totalCopies;
        } else {
            this.totalCopies = 1;
            System.out.println("Error: Total copies must be greater than zero.");
        }
        if (availableCopies >= 0 && availableCopies <= this.totalCopies) {
            this.availableCopies = availableCopies;
        } else {
            this.availableCopies = this.totalCopies;
            System.out.println("Error: Invalid initial available copies. Set to total copies.");
        }
    }

    public String getBookId() {
        return this.bookId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isBlank()) {
            this.title = title;
        } else {
            System.out.println("Error: Title cannot be null, empty, or whitespace-only.");
        }
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank()) {
            this.author = author;
        } else {
            System.out.println("Error: Author cannot be null, empty, or whitespace-only.");
        }
    }

    public int getTotalCopies() {
        return this.totalCopies;
    }

    public int getAvailableCopies() {
        return this.availableCopies;
    }

    public void borrowBook() {
        if (this.availableCopies > 0) {
            this.availableCopies--;
            System.out.println("Book borrowed successfully. Available copies: " + this.availableCopies);
        } else {
            System.out.println("Error: No copies available to borrow.");
        }
    }

    public void returnBook() {
        if (this.availableCopies < this.totalCopies) {
            this.availableCopies++;
            System.out.println("Book returned successfully. Available copies: " + this.availableCopies);
        } else {
            System.out.println("Error: All copies are already returned. Available copies cannot exceed total copies.");
        }
    }

    public void displayInfo() {
        System.out.println("------Library Book Info------");
        System.out.println("Book ID: " + getBookId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Total Copies: " + getTotalCopies());
        System.out.println("Available Copies: " + getAvailableCopies());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("B001", "Java Programming", "John Smith", 3, 2);
        book.displayInfo();

        book.borrowBook();
        book.borrowBook();
        book.borrowBook(); // Should fail, no copies left
        book.returnBook();
        book.borrowBook();
        book.displayInfo();
    }
}