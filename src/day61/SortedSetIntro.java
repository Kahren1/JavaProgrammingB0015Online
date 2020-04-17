package day61;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
    public static void main(String[] args) {
        //SortedSet interface extends Set interface
        //it is a data structure that stores unique elements in SORTED order
        //the implementing class is TreeSet
        //unique elements - keep them sorted - natural low to high order

        SortedSet mySet = new TreeSet<>();
        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(70);
        System.out.println("mySet = " + mySet);
        //a few extra methods available only in sortedSet because it is already sorted: first(), last()
        System.out.println("mySet.first() = " + mySet.first());
        System.out.println("mySet.last() = " + mySet.last());
    }
}
