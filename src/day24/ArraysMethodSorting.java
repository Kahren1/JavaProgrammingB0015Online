package day24;


import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {

        int[] scores = {99,44,66,23,19, 55};
        System.out.println(Arrays.toString(scores) );
        Arrays.sort(scores);
        // arrays are not resizable but mutable
        System.out.println(Arrays.toString(scores) );

        char[] nameChars = {'G', 'A', 'D', 'Z', 'C', 'A'};
        System.out.println("before sorting nameChars: " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting: " + Arrays.toString(nameChars));
//sorting occurs by ASCII table value
        String[] superHeroes = {"Superman", "Batmen", "Batman", "Aquaman", "Cyborg", "Flash"};
        String superHeroesString = Arrays.toString(superHeroes);
        System.out.println(superHeroesString);
        Arrays.sort(superHeroes);

        //sorting boolean [] var

        boolean[] fiveSwitchOnOff = {true, false, false, true, true};
       // System.out.println(Arrays.sort(fiveSwitchOnOff) );
        //no can do! sort does not take a boolean

    }
}
