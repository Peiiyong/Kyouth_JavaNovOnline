public class T3_TwoDimentionalArray {
    public static void main(String[] args) {
        int [][] matrix = new int[2][3];
        //2 rows 3 columns
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;

        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        
        int[][] matrix2 = {{1,2,3},{4,5,6}};
       
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==========================");
        for (int[] i : matrix2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
