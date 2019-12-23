package day05;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {
        //creating a Scanner object
        Scanner input = new Scanner (System.in);

        //asking the user " are you recording?"
        System.out.println("are you recording, true or false?");
        boolean isRecording = input.nextBoolean();
        System.out.println("We are not recording: " +!isRecording);


    }
}
