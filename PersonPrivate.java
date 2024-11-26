public class PersonPrivate{
    private String name="tt";
    private int age=20;

    public PersonPrivate(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void displayDetails(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        PersonPrivate person = new PersonPrivate("tt", 20);
        person.displayDetails();
    }
}