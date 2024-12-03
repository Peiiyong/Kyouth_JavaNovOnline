import java.util.Scanner;
/*
 * Create new file that the scanner get the value for the switch, 
 * if the user choose 1 he/she will enter stage that he/she needs to enter a value for 34 matrix, 
 * if the user choose 2 he/she will enter the stage that he/she need to enter values for 23 matrix. 
 * The result of the user must be shown regardless of the option.
 */
public class T4_Exercise2 {
    public static void main(String[] args) {
        String dayName;
        String matrix1[][] = new String[3][4];
        String matrix2[][] = new String[2][3];

        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        int day=sc.nextInt();

        switch(day){
            case 1:
            dayName = "Monday";
            
            for(int i=0;i<matrix1.length;i++){
                for(int j=0;j<matrix1[i].length;j++){
                   System.out.print("Enter a 3*4 matrix: ");
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
            dayName = "Tuesday";

            for(int i=0;i<matrix2.length;i++){
                for(int j=0;j<matrix2[i].length;j++){
                   System.out.print("Enter a 2*3 matrix: ");
                    matrix2[i][j] = sc.next() + sc.nextLine(); 
                }
            }

            System.out.println("=========Display Output==========");
            for(int i=0;i<matrix2.length;i++){
                for(int j=0;j<matrix2[i].length;j++){
                   System.out.print(matrix2[i][j]+" ");
                }
                System.out.println();
            }

            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 7:
            dayName = "Saturday";
            break;
        default:
            dayName = "Invalid Day";
            break;
        }

        System.out.println("Day of the week : " + dayName);
        sc.close();
    }
}