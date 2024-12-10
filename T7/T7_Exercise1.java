package T7;
import java.util.Scanner;

class Car{
    void price(){
        System.out.println("The price of the car is: ");
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

public class T7_Exercise1 {
    /*
     * Make a run-time polymorphism, has 3 extends for the cars. 
     * The user is supposed to enter the car name in the terminal and this is going to be output: 
     * if the user enters Toyota, the output should be 25,000RM 
     * if the user enters BMW, the output should be 85,000RM 
     * if the user enters Tesla, the output should be 75,000RM
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a car name:");
        String name=sc.nextLine();

        Car car1 = new Tesla();
        Car car2 = new Toyota();
        Car car3 = new BMW();

        if(name.equals("Toyota")){
            car2.price();
        }else if (name.equals("BMW")){
            car3.price();
        }else if(name.equals("Tesla")){
            car1.price();
        }else{
            System.out.println("Undefined");
        }
    }
}
