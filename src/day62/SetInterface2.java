package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterface2 {
    public static void main(String[] args) {
        //Creating a HashSet with items already inside
        //In HashSet there is no defined order!!! (LinkedHasSet does, though)
        //your output is in random order Java desires
        //HashSet - no duplicate (like any Set)
        //if is superfast  because it has only one restriction - unique only
        //it is not sorted (TreeSet does, though)
        //NOT indexed, like any other Set

        List<Integer> numList = Arrays.asList(10, 10, 20, 20, 30, 30);
        //HashSet Constructor takes anything that extends Collection
        //it will create a copy of it
        Set<Integer> myNums = new HashSet<>(numList);
        System.out.println("myNums = " + myNums);

        //Create a Set of String called states
        //add a bunch of states with some duplicate
        // iterate over them using any method we know

        Set<String> states = new HashSet<>(Arrays.asList("MD", "DC", "VA", "MD", "DC", "DC"));

        for (String each : states) {
            System.out.println(each);
        }

    }

}
