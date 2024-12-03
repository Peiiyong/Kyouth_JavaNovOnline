import java.util.Scanner;

public class T3_matrix3 {
    public static void main(String[] args) {
        String[][] matrix3 = new String[2][2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                if (matrix3[i][j] == null) {
                    matrix3[i][j] = String.valueOf(number);
                }
            }
        }

        System.out.println("The matrix number is:");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
