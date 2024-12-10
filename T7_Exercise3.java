import java.util.Scanner;

interface Car{
    void price();
    void message();
}

/* class Toyota implements Car{
    public void price(){
        System.out.println("The price of the car is: RM 25,000");
    } interface要用完全部
} */ 

class BMW implements Car{
    public void price(){
        System.out.println("The price of the car is: RM 85,000");
    }
    public void message(){
        System.out.println("BMW is one of the coolest car in the world");
    }
}

class Tesla implements Car{
    public void price(){
        System.out.println("The price of the car is: RM 75,000");
    }
    public void message(){
        System.out.println("Yes Tesla is the best electric car");
    }
}

public class T7_Exercise3 {
    /*
     * Same as the excercise 10 but this time instead of polymorphism, 
     * use the interface and there should be this meassage for Tesla:
    "Yes Tesla is the best electric car"
        there should be this meassage for BMW:
    "BMW is one of the coolest car in the world"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a car name:");
        String name=sc.nextLine();

        Car car1 = new Tesla();
        Car car2 = new BMW();

        if(name.equals("BMW")){
            car2.price();
            car2.message();
        }else if(name.equals("Tesla")){
            car1.price();
            car1.message();
        }else{
            System.out.println("Undefined");
        }
    }
}

