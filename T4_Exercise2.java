import java.util.Scanner;
/*
 * Create new file that the scanner get the value for the switch, 
 * if the user choose 1 he/she will enter stage that he/she needs to enter a value for 34 matrix, 
 * if the user choose 2 he/she will enter the stage that he/she need to enter values for 23 matrix. 
 * The result of the user must be shown regardless of the option.
 */
public class T4_Exercise2 {
/*    public static void main(String[] args) {
        String matrix1[][] = new String[3][4];
        String matrix2[][] = new String[2][3];

        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        int day=sc.nextInt();

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

            for(int i=0;i<matrix2.length;i++){
                for(int j=0;j<matrix2[i].length;j++){
                   System.out.print("Enter a 2*3 matrix [" + i +"]["+j+"] :");
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
        default:
            System.out.println("Invalid input!");
            break;
        }
        sc.close();
    }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                int[][] matrix1 = new int[3][4];
                input(matrix1, sc); // Populate the matrix
                System.out.println("========= Display Output ==========");
                display(matrix1); // Display the matrix
                break;
            case 2:
                int[][] matrix2 = new int[2][3];
                input(matrix2, sc); // Populate the matrix
                System.out.println("========= Display Output ==========");
                display(matrix2); // Display the matrix
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close(); // Close the scanner
    }

    // Method to display a matrix
    public static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Method to populate a matrix with user input
    public static void input(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}