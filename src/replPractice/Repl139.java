package replPractice;

import java.util.*;

public class Repl139 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < 2; i++) {
            num[i] = scan.nextInt();
        }
       // my code
        int[] arr;
        if (size >= 2) {
            arr = new int[2];
            for (int j = 0; j < 2; j++) {
                arr[j] = num[j];
            }
        } else {
            arr = new int[1];
            arr[0] = num[0];
        }
        System.out.println(Arrays.toString(arr));
//        if (num.length<2){
//            int []newSize=new int [1];
//            newSize[0]=num[0];
//            System.out.println(Arrays.toString(newSize));
//        }else {
//            int []newSize=new int [2];
//            newSize[0]=num[0];
//            newSize[1]=num[1];
//            System.out.println(Arrays.toString(newSize));
//        }

    }
}
