package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Your age is: " +age);
        //scanner.nextLine(); - this makes all the difference in capturing "enter"!

        System.out.println("Address?");
        String address = scanner.nextLine();
        System.out.println("Your address is: "+address);
    }
}
