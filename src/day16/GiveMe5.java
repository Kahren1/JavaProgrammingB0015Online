package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {

        //I want to ask user to enter a number
        //will keep asking until user enters 5
        Scanner scan = new Scanner(System.in);


        System.out.println("Give me the number 1-10:");
        int userNumber = scan.nextInt();

         while (userNumber!=5) {
             System.out.println("Try again!");
             userNumber = scan.nextInt();
         }
            System.out.println(" Good job!");
    }
}
