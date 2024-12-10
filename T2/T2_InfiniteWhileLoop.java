package T2;
public class T2_InfiniteWhileLoop {
    public static void main(String[] args) {
        int counter =1;
        while(counter <=5){
            System.out.println("Counter:" +counter);
            counter--; // continue run if the condition is <=5

            break;//STOP the loop after finish first loop
        }
    }
}
