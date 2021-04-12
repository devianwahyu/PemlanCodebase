package utp.soal1;

import java.util.ArrayList;

public class Soal {
    public static void main(String[] args) {

        // Instance 5 objects
        Book book1 = new Book("Mekanika Kuantum", Book.TECHNOLOGY, "Buku ini ditulis oleh Vani Sugiyono");
        Book book2 = new Book("Pemrograman Javascript", Book.TECHNOLOGY, "Buku ini ditulis oleh Betha Sidik");
        Book book3 = new Book("Pemrograman C++", Book.TECHNOLOGY, "Buku ini ditulis oleh Budi Raharjo");
        Book book4 = new Book("Mycroft Holmes", Book.BIOGRAPHY, "Buku ini ditulis oleh Kareem Abdul Jabbar");

        // Get a book
        System.out.println("========Get A Book========");
        Book.getBook(book1);

        // Get all books
        System.out.println("========Get List of Books========");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        Book.getBook(books);
    }
}
