package T3;
import java.util.Scanner;

public class T3_Exercise2 {
    /*
     * Use scanner to get the prices of the 5 different cars from the terminal and 
     * if the value of the car is equal or above 70000 RM, 
     * put them in the matrix of 22 which shows the value, "VIP", "2024", "pre-order" 
     * 
     * and if the value is below the 70000 
     * put them in the matrix of 22 which shows the value, "Cheap", "old", "for sale"
     */
/*     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] car = new String[5][4];


        for(int i=0;i<5;i++){
            System.out.print("Enter the price of car " + (i+1) + " :");
            double price = sc.nextDouble();

            car[i][0]=String.valueOf(price);

            if(price>=70000){
                car[i][1]="VIP";
                car[i][2]="2024";
                car[i][3]="pre-order";

            }else if(price<70000){
                car[i][1]="Cheap";
                car[i][2]="old";
                car[i][3]="for sale";
            }
        }

        for(int i=0;i<5;i++){
            System.out.println();
            System.out.print("Car " +(i+1)+" :");
            System.out.print(car[i][0]+", "+car[i][1]+", "+car[i][2]+", "+car[i][3]);
        }  
    } */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] above = new String[5][4];
        String[][] below = new String[5][4];
        int aboveCounter=0;
        int belowCounter=0;

        for(int i=0;i<5;i++){
            System.out.print("Enter the price of car " + (i+1) + " :");
            double price = sc.nextDouble();

            if(price>=70000){
                above[aboveCounter][0]=String.valueOf(price);
                above[aboveCounter][1]="VIP";
                above[aboveCounter][2]="2024";
                above[aboveCounter][3]="pre-order";
                aboveCounter++;

            }else if(price<70000){
                below[belowCounter][0]=String.valueOf(price);
                below[belowCounter][1]="Cheap";
                below[belowCounter][2]="old";
                below[belowCounter][3]="for sale";
                belowCounter++;
            }
        }

        System.out.println("\nVIP Car:");
            for(int i=0;i<aboveCounter;i++){
                System.out.print("Car " +(i+1)+" :");
                System.out.println(above[i][0]+", "+above[i][1]+", "+above[i][2]+", "+above[i][3]);
        }

        //Style2
        /* for(String [] row: above){//一行一行
            if(row[0]!=null){// [row][0] 不是null
                for(String cell:row){//print 排（data）
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
        }
 */
        System.out.println("\nCheap Car:");
        for(int i=0;i<belowCounter;i++){
            System.out.print("Car " +(i+1)+" :");
            System.out.println(below[i][0]+", "+below[i][1]+", "+below[i][2]+", "+below[i][3]);
        }
    sc.close();
    }
}