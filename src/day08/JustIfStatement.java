package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();

        System.out.println("What is the speed limit?");
        int speedLimit =scan.nextInt();

        if(currentSpeed>=speedLimit){
            System.out.println("Lotsa problems");
        }//esle program execution will continue

        System.out.println("the end of story, move on");
    }
}
