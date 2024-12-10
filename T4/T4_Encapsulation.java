package T4;
public class T4_Encapsulation {
    private String name;
    private int age;

    //Getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //Setter
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if(age >0){
            this.age=age;
        }
    }

    public static void main(String[] args) {
        T4_Encapsulation person = new T4_Encapsulation();
        person.setName("TAN");
        person.setAge(-1);

        System.out.println(person.getName()+" "+person.getAge());
    }
}
