public class T2_IfElse {
    public static void main(String[] args) {
        int num = -4;
        String color = "red";

        if (num > 0 || num ==0) {
            System.out.println("The number is positive.");
        } else if(num % 2== 0 && num >0){
            System.out.println("The number is even.");
        } else  {
            System.out.println("The number is negative.");
        }

        //? is positive, : is negative
        //num >0: positive
        String result = (num > 0) ? "positive" : "negative";
        System.out.println("Ternary result:" + result);

        //  ? "red" : if color is red
        // : "unknown" : else color is not red
        String result2 = (color.equals("red")) ? "red" : "unknown";
        System.out.println("Result2:" + result2);
    }
}
