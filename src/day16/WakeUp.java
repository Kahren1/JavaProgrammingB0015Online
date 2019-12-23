package day16;

import java.util.Scanner;

public class WakeUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gimme a four letter word");
        String word1 = scan.next();
        // start with an empty String
        String word2 = "" + word1.charAt(3)+word1.charAt(2) + word1.charAt(1) +word1.charAt(0);
        System.out.println(word2);
    }
}
