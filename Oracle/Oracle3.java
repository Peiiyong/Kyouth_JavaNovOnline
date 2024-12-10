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
public class Oracle3 {
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

         /*
     * 1. Create an array of Clothing objects and populate it using existing clothing object references.
            This array should be added to the main method of the ShopApp class.
            Declare and initialize variable items type of the Clothing array.
            This code should be placed after existing clothing items are created, before the code that does total calculation.
     */

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

    total = (item1.price+(item2.price*2))*(1+tax) ;
    System.out.println(total);

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
