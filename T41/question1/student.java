package question1;

import java.util.ArrayList;

public class student {
    //Create a program that manages a list of student names using an ArrayList.
    ArrayList<String> studentNames;

    public student(){
        this.studentNames = new ArrayList<>();
    }

    // add student
    public void addStudent(String name){
        if(studentNames.contains(name)){
            System.out.println("Student " + name + " already exists.");
        }else{
            studentNames.add(name);
            System.out.println("Student " + name + " is added.");
        }
    }

    // remove student
    public void deleteStudent(String name){
        if (studentNames.remove(name)) {
            System.out.println("Student " + name + " is removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    //display student
    public void displayStudents(){
        System.out.println("Dsiplay All Students: ");
        for(int i=0;i<studentNames.size();i++){
            System.out.println(studentNames.get(i));
        }
/*         for(String name : studentNames) {
            System.out.println(name);
        } */
    }

    public static void main(String[] args) {
        student s = new student();
        s.addStudent("TPY0");
        s.addStudent("TPY1");
        s.addStudent("TPY2");
        s.addStudent("TPY3");

        s.displayStudents();

        s.deleteStudent("null");
        s.deleteStudent("TPY2");
        System.out.println("After removing TPY2: ");
        s.displayStudents();      

    }
}

/* 
 * O U T P U T:
Dsiplay All Students: 
TPY0
TPY1
TPY2
TPY3
After removing TPY2:
Dsiplay All Students:
TPY0
TPY1
TPY3
 */
