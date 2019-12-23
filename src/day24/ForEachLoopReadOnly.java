package day24;

import java.util.Arrays;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {


        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println(yourFavNumber);

        long[]nums = {10,    40,   20};
        //how do I double my first item
        for (int x = 0; x < 3; x++) {
            
            System.out.println(nums[x]*=2);
        }
        for(long num:nums){
            num = 5;
            
        }
        for (long num:nums){
            System.out.println("num = " + num);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums).length());
        
    }
}
