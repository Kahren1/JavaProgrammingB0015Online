package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        //prompt user to enter the name
        //capture the result
        //print user's name

        //ask user for birth year
        //capture the result
        //print age

        //ask user for the height
        //capture the result
        ///print the height

        Scanner scan = new Scanner (System.in);
        System.out.println("Your name?");
        String name = scan.next();
        System.out.println("your name is: " + name);

        System.out.println("Your birthYear?");
        int birthYear = scan.nextInt();
        System.out.println("your birth year " + birthYear);

        System.out.println("Your height?");
        String height = scan.next();
        System.out.println("height is: " + height);







    }
}
