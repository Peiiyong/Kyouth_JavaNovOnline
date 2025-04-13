package question2;

import java.util.ArrayList;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean startProgram = true;

        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem(1, "Spring Rolls", 5.99, "Appetizer"));
        menu.add(new MenuItem(2, "Garlic Bread", 4.50, "Appetizer"));
        menu.add(new MenuItem(3, "Caesar Salad", 7.50, "Appetizer"));
        menu.add(new MenuItem(4, "Minestrone Soup", 6.00, "Appetizer"));
        menu.add(new MenuItem(5, "Grilled Salmon", 15.99, "Main Course"));
        menu.add(new MenuItem(6, "Beef Steak", 20.00, "Main Course"));
        menu.add(new MenuItem(7, "Vegetable Stir Fry", 10.50, "Main Course"));
        menu.add(new MenuItem(8, "Chicken Chop", 12.99, "Main Course"));
        menu.add(new MenuItem(9, "Spaghetti Bolognese", 11.50, "Main Course"));
        menu.add(new MenuItem(10, "Cheesecake", 6.00, "Dessert"));
        menu.add(new MenuItem(11, "Ice Cream", 4.50, "Dessert"));
        menu.add(new MenuItem(12, "Chocolate Cake", 5.50, "Dessert"));
        menu.add(new MenuItem(13, "Fruit Salad", 4.00, "Dessert"));

        while (startProgram) {
            option();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayMenu(menu);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    startProgram = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }

    private static void option() {
        System.out.println("----------Welcome to Restaurant Management System. ----------");
        System.out.println("1. Display Menu");
        System.out.println("2. Order");
        System.out.println("3. Waiter");
        System.out.println("4. Exit");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Please select an option (1-4): ");
    }

    private static void displayMenu(ArrayList<MenuItem> menu) {
        System.out.println("---------- Menu ----------");
        for (MenuItem item : menu) {
            System.out.println(item);
        }
        System.out.println("--------------------------");
    }
}
