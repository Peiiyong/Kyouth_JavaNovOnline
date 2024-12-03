import java.util.Scanner;

public class T4_Exercise3 {
       /*
     * Pass the person age and name and hight and weight using scanner, 
     * use the encapsulation to have set and get data and 
     * use the following formula to calculate bmi: (height-100)/weight

        The final result in console must be the following:
        The person name is ${genrated_name} and he/she is ${generated_age} years old 
        and his/her bmi is ${calculated_value_of_bmi}
     */

    private String name;
    private int age;
    private double height;
    private double weight;

    //Getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }
    //Setter
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if(age >0){
            this.age=age;
        }
    }

    public void setHeight(double height){
            this.height=height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double calBMI(double height, double weight){
        return weight / (height * height);
    }

     public static void main(String[]args){
        T4_Exercise3 person = new T4_Exercise3();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name=sc.next()+sc.nextLine();
        person.setName(name);
        System.out.print("Enter age:");
        int age=sc.nextInt();
        person.setAge(age);
        System.out.print("Enter height(in m):");
        double height=sc.nextDouble();

        if(height<3){
            person.setHeight(height);
            System.out.print("Enter weight:");
            double weight=sc.nextDouble();
            person.setWeight(weight);
            double bmi = person.calBMI(height, weight);
    
            System.out.println("The person name is "+person.getName()+" and he/she is "+person.getAge()+
            " years old and his/her bmi is " +bmi);
        }else{
            System.out.println("Invalid. Height should be enter in m");
        }
     }
}
