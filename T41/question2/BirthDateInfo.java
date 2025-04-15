package question2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class BirthDateInfo {
    public static void main(String[] args) {
        ArrayList<LocalDate> birthDates = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // (a) Ask for birthdate input
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        // Parse and add to ArrayList
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(input, formatter);
        birthDates.add(birthDate);

        // (b1) Day of the week born
        System.out.println("You were born on a: " + birthDate.getDayOfWeek());

        // (b2) Age
        LocalDate today = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthDate, today);
        System.out.println("Your age is: " + age);

        // (b3) Date 100 days from today
        LocalDate futureDate = today.plusDays(100);
        System.out.println("The date 100 days from today is: " + futureDate);

        scanner.close();
    }
}
