package T1;
public class T1_ExerciseStatic {

    static String name= "TAN";
    static int age = 20;
    static double height = 1.55;
    
    public void showDetails(){
        System.out.println("The student name is: "+ name + " ,age is "+age +" and height is "+height);
    }
    public static void main(String[] args) {
        T1_ExerciseStatic exercise = new T1_ExerciseStatic();
        exercise.showDetails();
    }
}