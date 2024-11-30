import java.util.Scanner;

public class T2_Exercise22 {
    /*
     * 2.2. Do the same as 2.1 just instead of if and else statement use ternary operator
     */
    private class Car {
        private String model;
        private String make;
        private double price;

        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T2_Exercise22 assignment = new T2_Exercise22();

        Car car1 = assignment.getCarDetails(scanner);
        Car car2 = assignment.getCarDetails(scanner);
        Car car3 = assignment.getCarDetails(scanner);

        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        System.out.println("The average price of the cars is: " + averagePrice);
        
        // Ternary Operator
        //String result = (num > 0) ? "positive" : "negative";
         String result = (averagePrice >= 100000) ? "Expensive" : 
                         (averagePrice >= 50000 && averagePrice <= 99999) ? "Normal" :
                         "Cheap";

        //Style2
        // String result = (averagePrice >= 100000) ? "Expensive" : 
        //                 (averagePrice >= 50000 && averagePrice <= 99999) ? "Normal" :
        //                 (averagePrice <= 49999) ?"Cheap":
        //                 "unknown price range";
        System.out.println("The car is " + result);
     }

    private Car getCarDetails(Scanner scanner) {
        System.out.println("Enter car model:");
        String model = scanner.nextLine();
        System.out.println("Enter car make:");
        String make = scanner.nextLine();
        System.out.println("Enter car price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character
        return new Car(model, make, price);
    }

}
