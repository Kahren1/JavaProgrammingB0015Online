package day24;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {
        int[]nums = {13, 31, 8, 5,21, 2};
        boolean isSorted = true;
        System.out.println("nums = " + Arrays.toString(nums));

        for (int x = 0; x < nums.length-1; x++) {
            if (!(nums[x]<=nums[x+1])){
                isSorted=false;
                break;
            }

        }
        System.out.println("Is array sorted: "+isSorted);
    }
}
