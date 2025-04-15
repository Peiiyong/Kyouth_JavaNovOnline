package question2;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
public class date {
    /*
     * . (a) Ask the user to enter their birth date (yyyy-MM-dd format).using an ArrayList.
     *   (b) Display:
                1. The day of the week they were born on.
                2. Their age.
                3. The date 100 days from today.
     */


    ArrayList<String> DOB;


    public date(){
        this.DOB = new ArrayList<>();
    }


    // display date of week
    public void displayDayOfWeek(String DOB){
        int year = Integer.parseInt(DOB.substring(0, 4));
        int month = Integer.parseInt(DOB.substring(5, 7));
        int day = Integer.parseInt(DOB.substring(8, 10));


        LocalDateTime date = LocalDateTime.of(year, month, day, 0, 0);
        String dayOfWeek = date.getDayOfWeek().toString();
        System.out.println("You were born on a: " + dayOfWeek);
    }




    // display age
    public int age(String DOB){
        int year = Integer.parseInt(DOB.substring(0, 4));
        int currentYear = LocalDateTime.now().getYear();
        int age = currentYear - year;
        return age;
    }


    //display 100 day from today
    public void display100DaysFromToday(){
        int hundred = LocalDateTime.now().getDayOfMonth();
        System.out.println("100 Days from today: " + (hundred +100));
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        date d = new date();  


        System.out.print("Enter your birth date (yyyy-MM-dd): ");
        String date = sc.next()+sc.nextLine();


        d.displayDayOfWeek(date);


        System.out.println("Your age is: " + d.age(date) + " years.");


        d.display100DaysFromToday();
    }
}
