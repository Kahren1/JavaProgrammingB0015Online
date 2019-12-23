package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWords2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Your name, current city,state, street address?");
        //nextLine - Scanner method to capture the whole line
        String wholeLine = scanner.nextLine();
        System.out.println("Your have entered: "+ wholeLine);
    }
}
