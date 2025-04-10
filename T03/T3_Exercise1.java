package T03;
public class T3_Exercise1 {
    /*
     * Create a Matrix with 3 rows and 3 columns which contains the car models and 
     * prices then fetch the car which values above 50,000 RM and portray it in the terminal
     */

     public static void main(String[] args) {
        String[][] matrix = new String [3][3];

        matrix[0][0] = "Proton";
        matrix[0][1] = "Saga";
        matrix[0][2] = "50000";

        matrix[1][0] = "Perodua";
        matrix[1][1] = "Myvi";
        matrix[1][2] = "55000";
        
        matrix[2][0] = "Honda";
        matrix[2][1] = "Accord";
        matrix[2][2] = "100000";

        String [][]matrix2 = {
            {"Proton","Saga","50000"},
            {"Perodua","Myvi","55000"},
            {"Honda", "Accord","100000"}
        };

        for(int i=0;i<matrix.length;i++){
            int price = Integer.parseInt(matrix[i][2]);
            if(price > 50000){
                System.out.println("The price for " + matrix[i][0] + " is " + matrix[i][2]);
            }
        }
     } 
}