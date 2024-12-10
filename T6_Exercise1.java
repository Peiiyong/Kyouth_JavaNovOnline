class Clothing{
    String description;
    double price;
    String size;
}

public class T6_Exercise1 {
   public static void main(String[] args) {

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
    
    System.out.println(item1.description+item1.price+item1.size);
    System.out.println(item2.description+item2.price+item2.size);

    total = (item1.price+(item2.price*2))*(1+tax) ;
    System.out.println(total);
   } 
}
