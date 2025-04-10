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
public class Oracle5 {
   public static void main(String[] args) {
    //Oracle 1
    double tax =0.2;
    double total=0.0;

    Clothing item1 = new Clothing();
    Clothing item2 = new Clothing();
    Clothing item3 = new Clothing();
    Clothing item4 = new Clothing();

    item1.description = "Blue Jacket";
    item1.price= 20.9;
    item1.size= "M";

    item2.description = "Orange T-Shirt";
    item2.price= 10.5;
    item2.size= "S";

    //Oracle 3
    // Clothing[] items = new Clothing[4];
    // items[0] = item1;
    // items[1] = item2;

        //Oracle 2
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");
        int measure =3;

        switch(measure){
            case 1,2,3: 
                c1.size="S";
                break;
                
            case 4,5,6:
                c1.size="M";
                break;
                
            case 7,8,9:
                c1.size="L";
                break;
                   
            default:
                c1.size="X";
        }  
        System.out.println("Name:"+c1.getName());
        System.out.println("Size:"+c1.getSize());   

         /*
         * Exercise 4-4: Using if Statements to Control Flow
            1. Change calculation of total value to only include those clothing items that match customer's size.
                Place this code inside the loop, before the total value calculation.
                Add an if condition that checks if customer size is the same as the clothing size.
                ou should only print information and calculate total for such items.
            2. Add two more items to the clothing array.
                Add two variables of type Clothing to the main method of a ShopApp class.
                Initialize these variables to reference two new Clothing objects.
                Set description, price, and size properties as:
                "Green Scarf", 5, "S" and "Blue T-Shirt", 10.5 and "S"
                Add these items to the Clothing array.
            3. Change logic in the for-each loop to exit the loop when total is > 15.
         */

         Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
         items[2].description = "Green Scarf";
         items[2].price = 5;
         items[2].size = "S";
         items[3].description = "Blue T-Shirt";
         items[3].price = 10.5;
         items[3].size = "S";
         
         System.out.println("Ecercise 4.4");
         for (Clothing item : items) {
            if(c1.getSize().equals(item.size)){//if(c1.size.equals(item.size)
                total = total+item.price;
                System.out.println(item.description + " " + item.price + " " + item.size);
                if (total > 15) {
                    break;
                }
            }
         }

         System.out.println("Final Total: " + total);
         
   } 
}
