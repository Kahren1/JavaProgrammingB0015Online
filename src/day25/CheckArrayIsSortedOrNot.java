package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {

        int[]nums = {13,31,8,5,21,2};
        //storing the length of an array
        int numsItemCount = nums.length;

        //creating an array with the same size
        int[]numsCopy = new int[numsItemCount];
//        numsCopy[0] = nums[0];
//        numsCopy[1] = nums[1];
//        numsCopy[2] = nums[2];
//        numsCopy[3] = nums[3];
//        numsCopy[4] = nums[4];
//        numsCopy[5] = nums[5];

        for (int i = 0; i < numsItemCount; i++) {
            numsCopy[i] =nums[i];
        }

        System.out.println("Before sorting numscopy ="+ Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        System.out.println("After sorting numscopy = "+Arrays.toString(numsCopy));

        if(!Arrays.equals(nums, numsCopy)){
            System.out.println("this is a sorted Array");
        }else{
            System.out.println("this array is not sorted");
        }
    }
}
