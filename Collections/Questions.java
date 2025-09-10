import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String author;

    // Default constructor
    public Book() {
        bookId = 0;
        bookName = "Unknown";
        author = "Unknown";
    }

    // Parameterized constructor
    public Book(int id, String name, String auth) {
        bookId = id;
        bookName = name;
        author = auth;
    }

    // Display method
    public void Display() {
        System.out.println("Book ID: " + bookId + "  Book Name: " + bookName + "  Author: " + author);
    }
}

public class Questions {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        // Creating book objects
        Book b1 = new Book(1, "Java ", " Gosling");
        Book b2 = new Book(2, "C ", " Ritchie");
        Book b3 = new Book(3, "Python ", " Rossum");

        // Adding books to ArrayList
        books.add(b1);
        books.add(b2);
        books.add(b3);

        // Displaying book details
        for (Book b : books) {
            b.Display();
        }
    }
}
