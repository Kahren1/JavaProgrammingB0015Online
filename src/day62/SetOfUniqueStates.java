package day62;

import java.util.*;

public class SetOfUniqueStates {
    public static void main(String[] args) {
        //Create a Set of String called states
        //add a bunch of states with some duplicate
        // iterate over them using any method we know

        Set<String> states = new HashSet<>(Arrays.asList("MD", "VA", "DC", "DC", "MD", "VA", "DC", "DC"));


        //or use addAll() for a Collection type
        states.addAll(Arrays.asList("MD", "VA", "DC", "DC"));

        //any type of Collection has size method to count the items, and has add() and addAll()
        //can we sort something that has no order? NO
        //NO sort() method
        System.out.println("Number of unique states: " + states.size());

        for (String each : states) {
            System.out.println(each);
        }

        //use Iterator for any type of Collection any time
        //Iterater has three methods we care about, in this case two

        //creating iterator.... simple... just call the method
        Iterator<String> stIter = states.iterator();
        //and now the Set<String> states is connected stIter
        // stIter is not an object! it is just a handle, a tool, a flashlight

        //we check whether we have the next element
        while (stIter.hasNext()) {
            System.out.println("stIter.next = " + stIter.next());
        }
        states.forEach(each -> System.out.println(" using forEach...each state " + each) );

        //common for each and every Collection
        //after magic arrow my logic
        states.removeIf(each -> each.contains("A"));
        System.out.println("states after = " + states);

        //lambda expression is cool
        //states.forEach(each->each.);

        //remove all the states with letter a
        //careful with the next() method - every call you move to the next element

        Iterator<String> stIter2 = states.iterator();
        while (stIter2.hasNext()) {
            String each = stIter2.next();
            if (each.contains("A")) {
                System.out.println("removing = " + each);
                stIter2.remove();
            }
        }
        System.out.println("states after removal =" + states);
    }
}
