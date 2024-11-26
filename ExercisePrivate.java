public class ExercisePrivate {
// int age
// String name
// double height
// double weight
    private int age=20;
    private String name="tt";
    private double height=1.55;
    private double weight=48;

    public ExercisePrivate(int age, String name,double height,double weight){
        this.age=age;
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    public void displayDetails(){
        System.out.println(age+name+height+weight);
    }

    public static void main(String[] args) {
        ExercisePrivate ep=new ExercisePrivate(20, "tt", 1.55, 48);
        ep.displayDetails();
    }
}
