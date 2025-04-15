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

    // display age
    public void age(String DOB){
        int year = Integer.parseInt(DOB.substring(0, 4));
        int month = Integer.parseInt(DOB.substring(5, 7));
        int day = Integer.parseInt(DOB.substring(8, 10));

        int currentYear = LocalDateTime.now().getYear();
        
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   

        System.out.print("Enter your birth date (yyyy-MM-dd): ");
        String date = input.next()+input.nextLine();

        System.out.println(LocalDateTime.now());
    }
}
