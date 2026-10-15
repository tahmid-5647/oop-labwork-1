// 14. Library Book Issue System 
// • Create a Book class with fields: title, author, isIssued (boolean). 
// • Add methods: 
// o issueBook() → sets isIssued = true if not already issued. 
// o returnBook() → sets isIssued = false. 
// • In main, create a book, issue it, try issuing again, return it, then issue again. 


public class Book2 {
    String title;
    String author;
    boolean isIssued;

    Book2(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book2 '" + title + "' has been successfully issued.");
        } else {
            System.out.println("Error: Book2 '" + title + "' is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book2 '" + title + "' has been successfully returned.");
        } else {
            System.out.println("Book2 '" + title + "' was not currently issued.");
        }
    }

    public static void main(String[] args) {
        Book2 myBook = new Book2("Java Programming", "John Smith");

        myBook.issueBook();
        myBook.issueBook();
        myBook.returnBook();
        myBook.issueBook();
    }
}