package T4;
import java.util.Scanner;
/*
 * Use the same code in assignment 7 this time. 
 * For both option 1 and option 2 the user must enter 12 values. 
 * If the user choose option 1 he/she will get the proper output 
 * but if the user chooses the option 2, he/she will get ArrayIndexOutOfBoundsException error.
 */
public class T4_Exercise4 {
    public static void main(String[] args) {
        String matrix1[][] = new String[3][4];
        String matrix2[][] = new String[2][3];

        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        int day=sc.nextInt();

        try{
            switch(day){
                case 1:
                
                for(int i=0;i<matrix1.length;i++){
                    for(int j=0;j<matrix1[i].length;j++){ //matrix1[i].length 表示第 i 行有多少列
                    System.out.print("Enter a 3*4 matrix [" + i +"]["+j+"] :");
                        matrix1[i][j] = sc.next() + sc.nextLine(); 
                    }
                }
                
                System.out.println("=========Display Output==========");
                for(int i=0;i<matrix1.length;i++){
                    for(int j =0;j<matrix1[i].length;j++){
                        System.out.print(matrix1[i][j] +" ");
                    }
                    System.out.println();
                }
                break;
            case 2:

                for(int i=-1;i<matrix2.length;i++){  
                //or (i-- && j--) or (i<=matrix2.length) or j<matrix2[j].length or matrix2[2][0]
                    for(int j=0;j<matrix2[i].length;j++){ 
                    System.out.print("Enter a 2*3 matrix [" + i +"]["+j+"] :");
                        matrix2[i][j] = sc.next() + sc.nextLine(); 
                    }
                }

                System.out.println("=========Display Output==========");
                for(int i=0;i<=matrix2.length;i++){
                    for(int j=0;j<matrix2[i].length;j++){
                    System.out.print(matrix2[i][j]+" ");
                    }
                    System.out.println();
                }

                break;
            default:
                System.out.println("Invalid input!");
                break;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        sc.close();
    }
}