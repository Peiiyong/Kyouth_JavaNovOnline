package T3;
public class T3_OneDimentionalArray {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        int[]arr2= {10,20,30,40,50};

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("===================");
        for(int i =0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        //Style 2
        for(int i:arr2){
            System.out.println(i);
        }
    }
}
