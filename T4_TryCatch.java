public class T4_TryCatch {
    public static void main(String[] args) {
        try {
            int[] number = {1,2,3};
            System.out.println(number[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally{
            System.out.println("This is the finally block");
        }
        System.out.println("This is the end of the program");
    }
}
