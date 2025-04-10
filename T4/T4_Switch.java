package T4;
public class T4_Switch {
    public static void main(String[] args) {
        int dayOfWeek =3;

        String dayName;
        switch(dayOfWeek){
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

        System.out.println("Day of the week: " + dayName);
    }
}