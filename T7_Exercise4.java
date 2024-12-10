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

public class T7_Exercise4 {
    /*
     * Switch case:
     * 1. Add String property size to the Customer class:
            Property name: size
            Property Type: String
        2. Use Customer in the main method of ShopApp.
        3. In the main method of the ShopApp class, set size property for the customer, Pinky.
            Place this logic immediately after the initialization of customer name.
            Set customer size to be "s".
        4. Create a measurement variable of type int and set it to the value of 3.
    5. Add the switch statement that derives customer size based on a measurement value.
     */
    public static void main(String[] args) {
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
