package T01;
public class T1_ExercisePrivate {
// int age
// String name
// double height
// double weight
    private int age;
    private String name;
    private double height;
    private double weight;

    public T1_ExercisePrivate(int age, String name,double height,double weight){
        this.age=age;
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    public void displayDetails(){
        double bmi = weight/(height +age);
        System.out.println(bmi);
    }

    public static void main(String[] args) {
        T1_ExercisePrivate ep=new T1_ExercisePrivate(20, "tt", 1.55, 48);
        ep.displayDetails();
    }
}