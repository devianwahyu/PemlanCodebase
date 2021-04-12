package utp.soal1;

import java.util.ArrayList;

public class Book {

    // Book categories
    public static final String BIOGRAPHY = "Biografi";
    public static final String TECHNOLOGY = "Teknologi";

    // To generate new id for new book
    private static int counterBook = 1;

    // Book specification
    private String title;
    private String category;
    private String description;
    private final int id;

    // Constructor with no description
    public Book(String title, String category) {
        this.title = title;
        this.category = category;
        this.description = "No description available";
        this.id = counterBook;
        counterBook++;
    }

    // Constructor with description
    public Book(String title, String category, String description) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.id = counterBook;
        counterBook++;
    }

    // Method for set description to a book
    public void setDescription(String description) {
        this.description = description;
    }

    // Static method to get a book
    public static void getBook(Book book) {
        printFormat(book);
    }

    // Static method to get all book
    public static void getBook(ArrayList<Book> books) {
        for (Book book : books) {
            printFormat(book);
        }
    }

    // Print format
    public static void printFormat(Book book) {
        System.out.printf("Id: %d\nTitle: %s\nCategory: %s\nDescription: %s\n\n", book.id, book.title, book.category,
                book.description);
    }

}
