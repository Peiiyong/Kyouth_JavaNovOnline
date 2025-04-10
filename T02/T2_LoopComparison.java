package T02;
public class T2_LoopComparison {
    public static void main(String[] args) {
        //for loop
        System.out.println("for loop");
        for(int counter=1;counter<=5;counter++){
            System.out.println("For loop counter:"+counter);
        }

        //while loop: the data can be vary, to get infinite loop
        System.out.println("While loop");
        int counter =1;
        while(counter <=5){
            System.out.println("While loop counter:"+counter);
            counter++;
        }

        //do-while loop
        System.out.println("Do-while loop");
        counter =1;
        do{
            System.out.println("Do-while counter"+counter);
            counter++;
        }while(counter<=5);
    }
}