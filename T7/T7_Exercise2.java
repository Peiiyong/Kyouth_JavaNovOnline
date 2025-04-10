package T7;
import java.util.Scanner;

abstract class Car{
    abstract void price();

    void description(){
        System.out.println("Discover the Thrill of Driving");
    }
}

class Toyota extends Car{
    void price(){
        System.out.print("The price of the car is: RM 25,000");
    }
}

class BMW extends Car{
    void price(){
        System.out.print("The price of the car is: RM 85,000");
    }
}

class Tesla extends Car{
    void price(){
        System.out.print("The price of the car is: RM 75,000");
    }
}

public class T7_Exercise2 {
    /*
     * Same as the excercise 10 but this time instead of polymorphism, use the abstract 
     * and there should be a business slogan on top of the price for each car
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a car name:");
        String name=sc.nextLine();

        Car car1 = new Tesla();
        Car car2 = new Toyota();
        Car car3 = new BMW();

        if(name.equals("Toyota")){
            car2.description();
            car2.price();
        }else if (name.equals("BMW")){
            car3.description();
            car3.price();
        }else if(name.equals("Tesla")){
            car1.description();
            car1.price();
        }else{
            System.out.println("Undefined");
        }
    }
}