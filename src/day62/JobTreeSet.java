package day62;

import day61.Job;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {
        //create a SortedSet of Job (from day 61) with TreeSet implementation
        //add 5 jobs, print them out vertically
        //we want the jobs to be sorted by natural order(salary)

      SortedSet<Job> jobs = new TreeSet<>();
        jobs.add(new Job("New York", 200_000, "Apple"));
        jobs.add(new Job("Zhitomir", 100_000, "Metallist"));
        jobs.add(new Job("Lipetsk", 100_000, "Ugol"));
        jobs.add(new Job("New York", 200_000, "BrightonBeach"));
        jobs.add(new Job("New York", 200_000, "Joppa"));
        //duplicates removed, jobs sorted by a natural order (our logic is by salary))

       //using the lambda
        jobs.forEach(each->System.out.println("Printing out using lambda  "+each));

       Iterator <Job> jobsIter= jobs.iterator();
       while(jobsIter.hasNext()){
           System.out.println(jobsIter.next());
       }

        //How does HashSet decide if 5 Person object(name, age) are duplicates or not.

    }//end main
}
