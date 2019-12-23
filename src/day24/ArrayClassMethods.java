package day24;

import java.util.Arrays;

public class ArrayClassMethods {
    public static void main(String[] args) {
        //Array class is a class coming from java.util package
        //lots of pre-built methods to work w array object

        //for printing the content of the array this method returns
        // a String representation of an Array object
        //toString --> Arrays.toString (yourArrayhere)

        String[] superHeroes = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        String superHeroesString = Arrays.toString(superHeroes);
        System.out.println(superHeroesString);
        //printing the first symbol will return [, the last one ]
        System.out.println(superHeroesString.charAt(0));

        double [] threeItems = {1.0, 2.0, 3.0};
        String pricesString = Arrays.toString(threeItems);
        for (int i = 0; i < pricesString.length(); i++) {
            System.out.println ("I have character " +pricesString.charAt(i) + " at index " +i);

        }

        //for sorting an array in ascending order
        //sort --> Arrays.sort(your array here)

        //for checking for equality of 2 array object content
        //equals --> Arrays.equals(firstArray, secondArray)

    }
}
