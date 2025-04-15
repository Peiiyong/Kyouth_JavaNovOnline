package question1;

/* C H A T G P T V E R S I O N */
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Manager ---");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name to add: ");
                    String nameToAdd = scanner.nextLine();
                    students.add(nameToAdd);
                    System.out.println(nameToAdd + " has been added.");
                }
                case 2 -> {
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (students.remove(nameToRemove)) {
                        System.out.println(nameToRemove + " has been removed.");
                    } else {
                        System.out.println(nameToRemove + " not found.");
                    }
                }
                case 3 -> {
                    System.out.println("\nList of Students:");
                    if (students.isEmpty()) {
                        System.out.println("No students in the list.");
                    } else {
                        for (String student : students) {
                            System.out.println("- " + student);
                        }
                    }
                }
                case 4 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
