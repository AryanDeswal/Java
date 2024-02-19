import java.util.*;

class Book {
    private String name;
    private String author;
    private String issuedTo;
    private Date issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public Date getIssuedOn() {
        return issuedOn;
    }

    public void issueBook(String userName) {
        if (issuedTo == null) {
            issuedTo = userName;
            issuedOn = new Date();
            System.out.println("Book '" + name + "' issued to " + userName + " on " + issuedOn);
        } else {
            System.out.println("Sorry, the book is already issued to " + issuedTo);
        }
    }

    public void returnBook() {
        if (issuedTo != null) {
            issuedTo = null;
            issuedOn = null;
            System.out.println("Book '" + name + "' returned successfully.");
        } else {
            System.out.println("The book is not issued to anyone.");
        }
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getName() + "' added to the library.");
    }

    public void issueBook(String bookName, String userName) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                book.issueBook(userName);
                return;
            }
        }
        System.out.println("Book '" + bookName + "' not found in the library.");
    }

    public void returnBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book '" + bookName + "' not found in the library.");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Java Programming", "John Doe"));
        library.addBook(new Book("Data Structures and Algorithms", "Jane Smith"));
        library.addBook(new Book("Introduction to Python", "Alice Johnson"));

        library.issueBook("Java Programming", "Alice");
        library.issueBook("Introduction to Python", "Bob");
        library.returnBook("Java Programming");
        library.issueBook("Java Programming", "Charlie");
    }
}