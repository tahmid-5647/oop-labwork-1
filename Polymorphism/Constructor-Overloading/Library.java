// Exercise 4: Library 
// • Constructors: 
// 1. Default constructor → "Empty Library". 
// 2. Constructor with library name. 
// • Method Overloading: 
// o addBook(String title) 
// o addBook(String title, String author) 
// o addBook(String title, String author, int year) 
// • Normal Methods: 
// o showLibraryDetails() → print library name and books count. 
// o totalBooks() → return number of books.


public class Library {
    String libraryName;
    int bookCount;

    Library() {
        this("Empty Library");
    }

    Library(String libraryName) {
        this.libraryName = libraryName;
        this.bookCount = 0;
    }

    void addBook(String title) {
        bookCount++;
        System.out.println("Added book: " + title);
    }

    void addBook(String title, String author) {
        bookCount++;
        System.out.println("Added book: " + title + " by " + author);
    }

    void addBook(String title, String author, int year) {
        bookCount++;
        System.out.println("Added book: " + title + " by " + author + " (" + year + ")");
    }

    void showLibraryDetails() {
        System.out.println("Library Name: " + libraryName + " | Total Books: " + bookCount);
    }

    int totalBooks() {
        return bookCount;
    }

    public static void main(String[] args) {
        Library lib1 = new Library();
        Library lib2 = new Library("Central City Library");

        lib1.showLibraryDetails();
        lib1.addBook("Java Programming");
        lib1.showLibraryDetails();

        System.out.println();

        lib2.showLibraryDetails();
        lib2.addBook("Clean Code", "Robert C. Martin");
        lib2.addBook("Design Patterns", "Erich Gamma", 1994);
        lib2.showLibraryDetails();
        System.out.println("Final book count check: " + lib2.totalBooks());
    }
}