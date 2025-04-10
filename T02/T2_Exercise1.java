package T02;
import java.util.Scanner;

public class T2_Exercise1 {
    /*
    Create a new private and public classes that can get at least 3 cars, model, make and price from the terminal, 
    and then calculate the average prices of the cars and show it in the terminal.
    */
    private String model;
    private String make;
    private double price;;

    public T2_Exercise1(String model, String make, double price){
        this.model=model;
        this.make=make;
        this.price=price;
    }

    public static void main(String[] args) {
        double totalprice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if(num>=3){
            for(int i=0;i<num;i++){
                System.out.println("Enter the model of car " + (i+1) + ":");
                String model=sc.next()+sc.nextLine();
                System.out.println("Enter the make of car " + (i+1) + ":");
                String make= sc.nextLine();
                System.out.println("Enter the price of car " + (i+1) + ":");
                double price = sc.nextDouble();
                
                T2_Exercise1 car = new T2_Exercise1(model, make, price);
                totalprice+= car.price;
            }
            double average = totalprice/num;
            System.out.println("The average price is " + average);
        }
      }
}