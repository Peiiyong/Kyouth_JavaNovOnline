public class PersonPrivate{
    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonPrivate(String name,int age,double height,double weight){
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
        PersonPrivate person = new PersonPrivate("tt", 20,1.55,48);
        person.displayDetails();
    }
}