package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {
        //I want to save user's input in response to questions
        //I want to use the saved input to use it further.

        //Step 1: Use Scanner class to create Scanner object to obtain this functionality

        Scanner scan = new Scanner (System.in);


        System.out.println("your age, pls");
        //whatever is entered will go into an age variable
        int age = scan.nextInt();
        //print the result of user's age
        System.out.println("your age 10 years ago was: " + (age-10));

        //prompt user for the name
        System.out.println("Type your fist name, pls.");
        //capture user's input from the keyboard in console
        String firstName = scan.next();
        //print saved from user's input
        System.out.println("User entered: " +firstName);






    }
}
