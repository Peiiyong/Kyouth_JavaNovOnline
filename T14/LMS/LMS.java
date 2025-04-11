import Book.Book;
import Library.Library;
import User.User;

public class LMS {
    public static void main(String[] args) {
        Library library=new Library();

        Book b1 = new Book("A Story of Yesterday","Sergio Cobo","111-111-001",true);
        Book b2 = new Book("To Kill a Mockingbird","Harper Lee","111-111-002",true);
        Book b3 = new Book("The Zombie Room","R.D. Ronald","111-111-003",true);
        Book b4 = new Book("A Clockwork Orange","Anthony Burgess","111-111-004",true);
    
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);

        User u1=new User();
        u1.setName("AAA");
        u1.setAge(12);

        User u2=new User();
        u2.setName("BBB");
        u2.setAge(18);

        library.listAvailableBooks();

        library.borrowBook(u1, "To Kill a Mockingbird");
        library.borrowBook(u1, "A Story of Yesterday");
        library.borrowBook(u2, "The Zombie Room");

/*         System.out.println("--------------------------------");
        System.out.println("Books borrowed by " + u1.getName() + ":");
        u1.printBorrowedBooks();
        System.out.println("Books borrowed by " + u2.getName() + ":");
        u2.printBorrowedBooks();

        System.out.println("--------------------------------"); */
        u1.returnBook("To Kill a Mockingbird");
/*         System.out.println("User "+u1.getName()+" : ");
        u1.printBorrowedBooks();

        library.searchByTitle("To Kill a Mockingbird"); */

        library.getBorrowedBooksForAllUsers();

        u1.checkDueDates();
        u2.checkDueDates();
        u1.checkOverdueBooks();
        u2.checkOverdueBooks();
    }
}
