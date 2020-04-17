package day61;

import java.util.*;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        //Keeps the insertion order (first come first serve)
        //and removes duplicates
        //LinkedHashSet is a subclass of HashSet
        Set<Integer> myNums = new LinkedHashSet<>();
        myNums.add(100);
        myNums.add(90);
        myNums.add(80);
        myNums.add(80);
        myNums.add(60);
        myNums.add(80);
        myNums.add(40);

        System.out.println("LinkedHashSet myNums = " + myNums);
//compare with HashSet, which does not keep the insertion order
        Set<Integer> myNums2 = new HashSet<>();
        myNums2.add(100);
        myNums2.add(90);
        myNums2.add(80);
        myNums2.add(80);
        myNums2.add(60);
        myNums2.add(80);
        myNums2.add(40);

        System.out.println("Hashset myNums2 = " + myNums2);




    }//end main

}
