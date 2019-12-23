package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int[]scores1 = {2,5,6,7,3,34,6};

        int[]scores3 = {2,5,6,7,3,34,6};
        int[]scores4 =  {34,5,6,7,3,2,6};

        //the only way to compare arrays
        //indexes takes into account in comparison
        System.out.println(Arrays.equals(scores1, scores3));
        System.out.println(Arrays.equals(scores3,scores4));

    }
}
