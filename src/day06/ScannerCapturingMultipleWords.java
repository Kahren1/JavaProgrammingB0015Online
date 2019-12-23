package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two words");
        String firstWord = scanner.next(); //captures the first word
        String secondWord = scanner.next(); //captures the second word
        System.out.println("First word: " +firstWord + "\nSecond word: " +secondWord);
    }
}
