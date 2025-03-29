package libraryManagement;

import java.util.ArrayList;

public class Account {
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnedBook();
                borrowedBooks.remove(book);
                System.out.println("Book returned successfully: " + book.getTitle());
                return;
            }
        }
        System.out.println("You haven't borrowed this book.");
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
