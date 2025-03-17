import java.util.*;

// Superclass: Book
class Book {

    protected String title;
    protected int publicationYear;

    // Constructor to initialize Book details
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {

    private String name;
    private String bio;

    // Constructor to initialize Author details
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class to test Book and Author
public class LibraryManagement {
    public static void main(String[] args) {

        // Creating an Author object
        Author author = new Author("Wings of Fire", 1999, "A.P.J. Abdul Kalam", "Former President and renowned scientist of India");

        // Displaying book and author details
        author.displayInfo();
    }
}
