package libraryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryDataBase {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBooks() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = scan.nextLine();

        System.out.print("Enter Author: ");
        String author = scan.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = scan.nextLine();

        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully! 📚");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void libraryMenu(User user, Account account) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");

            if (user.isLibrarian()) {
                System.out.println("4. Add Books");
                System.out.println("5. Exit");
            } else {
                System.out.println("4. Exit");
            }

            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    displayBooks();
                    break;

                case 2:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scan.nextLine();
                    Book bookToBorrow = searchBook(borrowTitle);

                    if (bookToBorrow != null && bookToBorrow.isAvailable()) {
                        bookToBorrow.borrowedBook();
                        account.addBorrowedBook(bookToBorrow);
                        System.out.println("Book borrowed successfully!");
                    } else {
                        System.out.println("Book is not available.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scan.nextLine();
                    account.returnBook(returnTitle);
                    break;

                case 4:
                    if (user.isLibrarian()) {
                        addBooks();
                    } else {
                        System.out.println("Exiting...");
                        return;
                    }
                    break;

                case 5:
                    if (user.isLibrarian()) {
                        System.out.println("Exiting...");
                        return;
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
