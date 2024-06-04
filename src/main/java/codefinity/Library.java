package codefinity;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookById(int id) {
        List<Book> booksToRemove = new ArrayList<>();
        for (Book book : books) {
            if (book.getId() == id) {
                booksToRemove.add(book);
            }
        }
        books.removeAll(booksToRemove);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public List<Book> findBooksPublishedAfterYear(int year) {
        List<Book> booksAfterYear = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year) {
                booksAfterYear.add(book);
            }
        }
        return booksAfterYear;
    }

    public void displayAllBooks() {
            System.out.println(books);
        }
}

