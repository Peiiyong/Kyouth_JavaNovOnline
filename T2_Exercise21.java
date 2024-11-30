import java.util.Scanner;

public class T2_Exercise21 {
    /*
     * 2.1. Use the code in assignment 2 and use if and else statement so, 
     * if the average car prices are higher than the 100,000 the output shows the cars are expensive 
     * if its between 50,000 to 99,999 the output shows the cars are normal price and 
     * if it is less than 49,999 it shows the cars are cheap
     */
    private class Car {
        private String model;
        private String make;
        private double price;
        //private double[]carPrice = new double[3];

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
        T2_Exercise21 assignment = new T2_Exercise21();

        Car car1 = assignment.getCarDetails(scanner);
        Car car2 = assignment.getCarDetails(scanner);
        Car car3 = assignment.getCarDetails(scanner);

        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        System.out.println("The average price of the cars is: " + averagePrice);
        
        if(averagePrice > 100000){
            System.out.println("Expensive");
         }
         else if(averagePrice > 50000 && averagePrice < 99999){
             System.out.println("Normal");
         }
         else if(averagePrice < 49999){
             System.out.println("Cheap");
         }
     }

    private Car getCarDetails(Scanner scanner) {
        System.out.println("Enter car model:");
        String model = scanner.nextLine();
        System.out.println("Enter car make:");
        String make = scanner.nextLine();
        System.out.println("Enter car price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character , Without this line: will jump to "make" for the next loop
        return new Car(model, make, price);
    }
}
