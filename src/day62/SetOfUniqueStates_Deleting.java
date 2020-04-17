package day62;

import java.util.*;

public class SetOfUniqueStates_Deleting {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("MD", "VA", "DC", "DC", "MD", "VA", "DC", "DC", "GA", "GA", "AL", "MN"));

        //Magical option - Java 8 magic - each and every collection
        states.removeIf(elem ->elem.contains("D"));
        System.out.println("states after removing with lambda = " + states);


        //No option to remove by index since Set is not ordered!
        states.remove("GA");
        //DO NOT remove using for-each loop!
        //what remains is only the Iterator
        System.out.println("states = " + states);
        ;

        //remove all the states with letter "A"
        //Iterator has 3 methods hasNext() next() remove() - they work together
        //need an Iterator tool to iterate over the Collection
        Iterator<String> stIter = states.iterator();
        while (stIter.hasNext()) {

            String each = stIter.next();
//every time we call the next() method, the pointer is shifted to the next location
            if (each.contains("A")) {
                System.out.println("removing..." + each);
                // we use Iterator method do remove an element
                stIter.remove();
                //no need to deal with any index
                //the tool is doing everything
            }
        }
        System.out.println("states = " + states);
        System.out.println("stIter.hasNext() = " + stIter.hasNext());
        try {
            System.out.println("stIter.next()=" + stIter.next());
        }catch(NoSuchElementException e){
            System.out.println("Exception caught "+ e);
        }


        //states.removeIf(->contains("A"));

    }
}
