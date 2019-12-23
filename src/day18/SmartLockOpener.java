package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("gimme a password");
        String passwordTry = scan.next();

        while(!passwordTry.equals("B15")) {
            System.out.println("Not a match! Try again");
            passwordTry = scan.next();
        }
        System.out.println("Open Sesame");
    }
}
