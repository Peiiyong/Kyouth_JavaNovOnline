package T01;
public class T1_Exercise {
    /**
     * Have these values, car manufactures year, car price and car name. 
     *Then pass a value which can calculate care price multiply car manufactured year.
    */
    
    private int year;
    private double price;
    private String name;

    public T1_Exercise(int year, double price, String name){
        this.year=year;
        this.price=price;
        this.name=name;
    }

    public void calculate(){
        double total = (price * year)/1000;
        System.out.println(name+":"+total);
    }
    
    public static void main(String[] args) {
        T1_Exercise exe=new T1_Exercise(2000, 40000, "a");
        exe.calculate();
    }
}