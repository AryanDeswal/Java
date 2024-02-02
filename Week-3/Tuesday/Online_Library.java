import java.util.ArrayList;

class Online_Library {
    private ArrayList<String> availableBooks;
    private ArrayList<String> issuedBooks;

    public Online_Library() {
        this.availableBooks = new ArrayList<>();
        this.issuedBooks = new ArrayList<>();
    }

    public void addBook(String bookTitle) {
        availableBooks.add(bookTitle);
        System.out.println("Book added: " + bookTitle);
    }

    public void issueBook(String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println("Book issued: " + bookTitle);
        } else {
            System.out.println("Book not available for issuing: " + bookTitle);
        }
    }

    public void returnBook(String bookTitle) {
        if (issuedBooks.contains(bookTitle)) {
            issuedBooks.remove(bookTitle);
            availableBooks.add(bookTitle);
            System.out.println("Book returned: " + bookTitle);
        } else {
            System.out.println("Book not issued from this library: " + bookTitle);
        }
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (String book : availableBooks) {
            System.out.println(book);
        }
    }

    public void showIssuedBooks() {
        System.out.println("Issued Books:");
        for (String book : issuedBooks) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Online_Library library = new Online_Library();

        System.out.println("Adding Books To The Library: ");
        library.addBook("Java Programming");
        library.addBook("Data Structures and Algorithms");
        library.addBook("Introduction to Python");
        System.out.println();
        
        library.showAvailableBooks();
        System.out.println();
        
        System.out.println("Issuing Books From The Library: ");
        library.issueBook("Java Programming");
        library.issueBook("Artificial Intelligence");
        System.out.println();
        
        library.showIssuedBooks();
        library.showAvailableBooks();
        System.out.println();
        
        library.returnBook("Java Programming");
        System.out.println();

        library.showIssuedBooks();
        library.showAvailableBooks();
    }
}
