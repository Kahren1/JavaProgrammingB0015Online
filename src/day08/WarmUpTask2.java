package day08;

import javax.swing.*;
import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        /* guessing game with favorite number 3
        if => Bingo, if not -> try again
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Guess my favorite number");
        int myFavoriteNumber = scan.nextInt();

        if (myFavoriteNumber ==300){
            System.out.println("Bingo!");
        }else {
            System.out.println("You are not my best friend");
        }
    }
}
