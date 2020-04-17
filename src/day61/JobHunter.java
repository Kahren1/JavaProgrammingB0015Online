package day61;

import java.util.*;

public class JobHunter {
    public static void main(String[] args) {
        List<Job> jobList = new LinkedList<>();

        Job j1 = new Job("MD", 80_000, "BMW");
        Job j2 = new Job("GA", 100_000, "BOFA");

        System.out.println("j1.compareTo(j2) = " + j1.compareTo(j2));
        jobList.add(j1);
        jobList.add(j2);
        jobList.add(new Job("GA", 400_000, "dOFA"));
        jobList.add(new Job("CA", 300, "cOFA"));
        jobList.add(new Job("BA", 200_000, "BOFA"));
        jobList.add(new Job("AA", 100_000, "aOFA"));
        System.out.println("j1.compare to (jobList.get(3) ) = " + j1.compareTo(jobList.get(3)));
//the sort method does internal call
        //uses the comparing logic provided in the implementation of the compareTo(Job other) method
        Collections.sort(jobList);
        System.out.println(jobList);
        //Comparator.reverseOrder(_ will give you an object w reverse comparing logic
        //Collections.sort(jobList, Comparator.reverseOrder()); or
        //Collection.sort(jobList, Collections.reversOrder());
        //both are static helper methods, no functional difference at all, just in different places
        Collections.sort(jobList,Comparator.reverseOrder());
        System.out.println("jobList with using a Comparator with reverse comparing logic");
        System.out.println(jobList);
        //Collections method with reverse comparing logic
        //Collections is a class with a number of utility methods
        //Collections.reverseOrder()
        //.reverseOrder method will reverse order from int compareTo(Datatype dtype) natural order
        //the difference between Comparator.reverseOrder() and Collections.reverseOrder() only the location difference
        //both a static methods - one belongs to Comparator interface, another to Collections class.
        Collections.sort(jobList);
        System.out.println(jobList);


    }
}
