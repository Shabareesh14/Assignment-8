package libraryManagement;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowedBook() {
        isAvailable = false;
    }

    public void returnedBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + ISBN + " | Availability: " + (isAvailable ? "Available" : "Borrowed");
    }
}
