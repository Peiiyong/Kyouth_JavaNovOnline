public class T2_Exercise3 {
    /*
     * Create a loop that uses the for loop whtich begins from the number 1 and adds single number each. 
     * it continues till it breaks at number 26. Use break at number number 26 and continue in number 14
     */
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i==26) {
                break;
            }else if (i==14) {
                continue; 
            }
            System.out.println("Counter:"+i);
        }
    }
}

