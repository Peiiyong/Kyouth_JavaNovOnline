class Clothing{
    String description;
    double price;
    String size;
}

class Customer{
    String size;
    String name;

    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSize(String size){
        this.size=size;
    }

}
public class Oracle4 {
   public static void main(String[] args) {
    //Oracle 1
    double tax =0.2;
    double total=0.0;

    Clothing item1 = new Clothing();
    Clothing item2 = new Clothing();

    item1.description = "Blue Jacket";
    item1.price= 20.9;
    item1.size= "M";

    item2.description = "Orange T-Shirt";
    item2.price= 10.5;
    item2.size= "S";

    //Oracle 3
     Clothing[]items = new Clothing[2];
    items[0]=item1;
    items[1]=item2;

    System.out.println("Exercise 3:");
    for(Clothing item:items){
        System.out.println(item.description+item.price+item.size);
    }
    
    System.out.println("Exercise 1:");
    System.out.println(item1.description+item1.price+item1.size);
    System.out.println(item2.description+item2.price+item2.size);

    // total = (item1.price+(item2.price*2))*(1+tax) ;
    // System.out.println(total);

        /*
     * Exercise 4-3: Using a Loop to Process an Array
1. Remove code that calculates total.
Retain declaration of the total variable and the code that prints the total value.
Place comments on existing lines of code that calculate total.
Ensure that you still have the total variable declared and set its value to 0.
2. Iterate through this array and calculate total cost of all items including tax.
Create a for-each loop that iterates through all items in the Clothing array and calculates the running total price for these items including tax.
3. Remove code that prints details of individual clothing objects.
4. In a loop, print details of each clothing object.
Place this code inside the loop, before the total value calculation.
     */

        System.out.println("Exercise 4-------------------------");
        for(Clothing item:items){
            System.out.println(item.description+item.price+item.size);
            total += (item.price)*(tax+1);
        }

        System.out.println("The total is:"+total);
    //Oracle 2
    Customer c1 = new Customer();
    c1.setName("Pinky");
    c1.setSize("S");
    int measure =3;

    switch(measure){
        case 1,2,3:
            c1.setSize("XS");
            break;
        case 4,5,6:
            c1.setSize("S");
            break;
        case 7:
            c1.setSize("M");
            break;
        case 8:
            c1.setSize("L");
            break;
        default:
            System.out.println("Invalid");
    }  
    System.out.println("Name:"+c1.getName());
    System.out.println("Size:"+c1.getSize());   

   } 
}

