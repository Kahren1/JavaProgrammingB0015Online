package day62;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIntro {
    public static void main(String[] args) {
        //Set is a data structures to store UNIQUE elements:
        //HashSet implements Set interface and is always the default choice
        //It does NOT keep insertion order (LinkedHashSet does, though)
        //it does NOT have index (only List implementations do does)

        Set<Integer> myNums = new HashSet<>();
        //the ONLY thing Set has - NO duplicates!
        //All the rest is the stuff from Collection framework

        //anything in Collection framework
        //if you want to see what inside - just print it

        myNums.add(10);
        myNums.add(20);
        myNums.add(11);
        myNums.add(10);
        myNums.add(13);
        myNums.add(10);
        myNums.add(15);

        System.out.println("myNums = " + myNums);
        // is you try to add duplicate - it ignores them
        //Set has only one responsibility - no duplicates


    }
}
