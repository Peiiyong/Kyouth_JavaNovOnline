public class T1_PersonPrivate{
    // private restricts its access to only within the same class.
    private String name;
    private int age;
    private double height;
    private double weight;

    public T1_PersonPrivate(String name,int age,double height,double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    public void displayDetails(){
        double bmi= weight/(height + age);
        System.out.println(bmi);
    }

    public static void main(String[] args) {
        T1_PersonPrivate person = new T1_PersonPrivate("tt", 20,1.55,48);
        person.displayDetails();
    }
}