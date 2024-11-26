public class ExercisePrivate {
// int age
// String name
// double height
// double weight
    private int age;
    private String name;
    private double height;
    private double weight;

    public ExercisePrivate(int age, String name,double height,double weight){
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
        ExercisePrivate ep=new ExercisePrivate(20, "tt", 1.55, 48);
        ep.displayDetails();
    }
}
