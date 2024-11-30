import java.util.Scanner;

public class T3_Exercise2ans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] vipCars = new String[5][4];
        String[][] cheapCars = new String[5][4];
        int vipIndex = 0;
        int cheapIndex = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the price of car " + (i + 1) + ": ");
            int price = scanner.nextInt();

            if (price > 70000) {
                if (vipIndex < vipCars.length) { //the array can only hold 5 data
                    vipCars[vipIndex][0] = String.valueOf(price);
                    vipCars[vipIndex][1] = "VIP";
                    vipCars[vipIndex][2] = "2024";
                    vipCars[vipIndex][3] = "pre-order";
                    vipIndex++;
                }
            } else {
                if (cheapIndex < cheapCars.length) { // the array can only hold 5 data
                    cheapCars[cheapIndex][0] = String.valueOf(price);
                    cheapCars[cheapIndex][1] = "Cheap";
                    cheapCars[cheapIndex][2] = "old";
                    cheapCars[cheapIndex][3] = "for sale";
                    cheapIndex++;
                }
            }
        }


        System.out.println("VIP Cars:");
        // is is same as int []i :arr
        /* for (int i = 0; i < vipCars.length; i++) {
            String[] row = vipCars[i];
        } */
        for (String[] row : vipCars) { //一行一行
            if (row[0] != null) { //第一行不是0

                /* for (int j = 0; j < row.length; j++) {
                    String cell = row[j];
                    System.out.print(cell + " ");
                }       */          
                for (String cell : row) {//print 排（data）
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        }


        System.out.println("Cheap Cars:");
        boolean hasCheapCars = false;
        for (String[] row : cheapCars) {
            if (row[0] != null) {
                hasCheapCars = true;
                for (String cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        }
        if (!hasCheapCars) {
            System.out.println("No cheap cars available.");
        }

        scanner.close();
    }
}
