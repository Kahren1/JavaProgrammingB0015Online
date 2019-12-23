package replPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Repl122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int[]pairs = new int[3];
        int k=0;

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairs[k]=nums[i];
                    k++;
                }
            }
        }
        for (int m = 0; m <nums.length ; m++) {
            if ((nums[m] != pairs[0]) && (nums[m] != pairs[1]) && (nums[m] != pairs[2])) {
                System.out.println("unique number: "+ nums[m]);
            }
        }
    }
}
