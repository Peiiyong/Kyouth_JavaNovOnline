public class ExerciseStatic {

    static String name= "TAN";
    static int age = 20;
    static double height = 1.55;
    
    public void showDetails(){
        System.out.println("The student name is: "+ name + " ,age is "+age +" and height is "+height);
    }
    public static void main(String[] args) {
        ExerciseStatic exercise = new ExerciseStatic();
        exercise.showDetails();
    }
}
