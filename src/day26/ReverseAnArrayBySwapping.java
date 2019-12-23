package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {
    public static void main(String[] args) {

        //                          0 1 2  3  4  5   6
        int[] myNumbers = new int[]{5,1,21,2, 3, 13, 8};
        int lastIndex = myNumbers.length-1;
        System.out.println(Arrays.toString(myNumbers));
        for (int i = 0; i <= lastIndex/2 ; i++) {

            System.out.println(myNumbers [i] + " "+myNumbers[lastIndex]);
            int temp = myNumbers[i];
            myNumbers[i] = myNumbers[lastIndex];
            myNumbers[lastIndex]=myNumbers[i];
            lastIndex--;
        }
        System.out.println("After the swap: ");
        System.out.println(Arrays.toString(myNumbers));
    }
}
