class Customer{
    String size;
    String name;

    Customer(String name){
        this.name=name;
    }

    public String getSize(){
        return name;
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
        Customer c1 = new Customer("Pinky");
        c1.setSize("S");
        int measure =3;

        switch(measure){
            case 1:
                c1.setSize("XS");
                break;
            case 2:
                c1.setSize("S");
                break;
            case 3:
                c1.setSize("M");
                break;
            case 4:
                c1.setSize("L");
                break;
            default:
                System.out.println("Invalid");
        }  
        System.out.println("The size of Pinky is:"+c1.size);
    }
}
