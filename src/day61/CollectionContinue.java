package day61;

import java.util.*;

public class CollectionContinue {
    public static void main (String [] args){
        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println("nums = "+nums);
        //can't use get() method with Collection as reference type.
        //Only reference type determine access at the compile-time

        //I want to sort the collection
       ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
       //using Collections utilities class
       Collections.sort(num2);
       System.out.println(num2);
       Collections.sort((List)nums);
       System.out.println(nums);

    }
}
