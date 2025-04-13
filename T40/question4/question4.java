package question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class question4 {
    private ArrayList<Book> catalog;

    public question4() {
        this.catalog = new ArrayList<>();
    }

    // Add new book to the catalog
    public void addBook(String title, String isbn) {
        Book book = new Book(title, isbn);
        catalog.add(book);
        Collections.sort(catalog); 
    }

    // Search for a book by title using binary search
    public Book searchByTitle(String title) {
        int low = 0;
        int high = catalog.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Book midBook = catalog.get(mid);

            if (midBook.getTitle().equalsIgnoreCase(title)) {
                return midBook;
            } else if (midBook.getTitle().compareToIgnoreCase(title) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; 
    }

    // Search for a book by ISBN using binary search
    public Book searchByIsbn(String isbn) {
        int low = 0;
        int high = catalog.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Book midBook = catalog.get(mid);

            if (midBook.getIsbn().equals(isbn)) {
                return midBook;
            } else if (midBook.getIsbn().compareTo(isbn) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; 
    }

    // Display all books in the catalog
    public void displayBooks() {
        if (catalog.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            for (Book book : catalog) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        question4 libraryCatalog = new question4();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n-----------Library Catalog Menu:-------------");
            System.out.println("1. Add new book");
            System.out.println("2. Search for a book by title");
            System.out.println("3. Search for a book by ISBN");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Add new book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    libraryCatalog.addBook(title, isbn);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    // Search by title
                    System.out.print("Enter book title to search: ");
                    title = scanner.nextLine();
                    Book foundByTitle = libraryCatalog.searchByTitle(title);
                    if (foundByTitle != null) {
                        System.out.println("Book found: " + foundByTitle);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    // Search by ISBN
                    System.out.print("Enter book ISBN to search: ");
                    isbn = scanner.nextLine();
                    Book foundByIsbn = libraryCatalog.searchByIsbn(isbn);
                    if (foundByIsbn != null) {
                        System.out.println("Book found: " + foundByIsbn);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    // Display all books
                    libraryCatalog.displayBooks();
                    break;
                case 5:
                    // Exit
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
