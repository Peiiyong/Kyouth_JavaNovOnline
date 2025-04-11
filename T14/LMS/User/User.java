package User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    String name;
    int age;
    ArrayList<String>borrowedBooks = new ArrayList<String>();
    private Map<String, LocalDate> borrowedBooksDueDates = new HashMap<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Adds the book title to the borrowedBooks list.
    public void borrowBook(String bookTitle){
        boolean borrowed = false;

        for (int i = 0; i < borrowedBooks.size(); i++) {
            if(borrowedBooks.get(i).equals(bookTitle)){
                borrowed = true;
                break;
            }
        }

        if(!borrowed){
            borrowedBooks.add(bookTitle);
            LocalDate due=LocalDate.now().plusDays(14);
            borrowedBooksDueDates.put(bookTitle, due);
            System.out.println(bookTitle+" has been borrowed. \nDue Date:"+due);
        }
    }
    
    // Removes the book from the list if the user has borrowed it, and prints a message indicating success or failure.
    public void returnBook(String bookTitle){
        boolean found = false;

        for (int i = 0; i < borrowedBooks.size(); i++) {
            if(borrowedBooks.get(i).equals(bookTitle)){
                borrowedBooks.remove(i);
                borrowedBooksDueDates.remove(bookTitle);
                found = true;
                break;
            }
        }

        if(found == true){
            System.out.println("Book returned successfully.");
        }else{
            System.out.println("Invalid book title.");
        }

    /*  if(borrowedBooks.contains(bookTitle)){
            borrowedBooks.remove(bookTitle);
            System.out.println("Success!");
        }else{
            System.out.println("Invalid book title.");
        } */
    }

    // prints all books the user has borrowed.
    public void printBorrowedBooks(){
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (String book : borrowedBooks) {
                System.out.println(book);
            }
        }
        
/*         for (int i = 0; i < borrowedBooks.size() ; i++){
            if(borrowedBooks.get(i) !=null){
                System.out.println(borrowedBooks.get(i));
            }else{
                System.out.println("");
            }
        } */
    }

    public void checkDueDates(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        for(Map.Entry<String, LocalDate> book:borrowedBooksDueDates.entrySet()){
            String bookTitle=book.getKey();
            LocalDate due=book.getValue();
            System.out.println("Book: "+bookTitle+"\nDue Date: "+due.format(formatter));
        }
    }

    //from lp
    public void checkOverdueBooks() {
        LocalDate today = LocalDate.now();
        boolean overdue = false;
        for (Map.Entry<String, LocalDate> entry : borrowedBooksDueDates.entrySet()) {
            if (entry.getValue().isBefore(today)) {
                overdue = true;
                long daysOverdue = today.toEpochDay() - entry.getValue().toEpochDay();
                System.out.println("Book: " + entry.getKey() + " is overdue by " + daysOverdue + "days.");
            }
        }
        if (!overdue) {
            System.out.println("No overdue books.");
        }
    }
}
