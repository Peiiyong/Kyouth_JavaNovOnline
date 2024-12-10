package T4;
import java.util.Scanner;
/*
 * Use Scanner to get the day number and the result of the switch must be portrayed in the console.
 */
public class T4_Exercise1 {
    public static void main(String[] args) {
        String dayName;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        int day=sc.nextInt();
        sc.close();

        switch(day){
            case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
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
    }
}
