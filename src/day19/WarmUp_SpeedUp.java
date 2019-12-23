package day19;

import java.util.Scanner;

public class WarmUp_SpeedUp {
    public static void main(String[] args) {
        //counting fr 1 to 10
//        for (int i = 1; i <=10 ; i++) {
//            System.out.print(i + " ");
//        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start and end speed as ints: ");
        int start = scan.nextInt();
        int end = scan.nextInt();

        for (int i=start; i<=end; i++){

            System.out.print(i+", ");

        }
        System.out.println("you have started at speed: "+start);
        System.out.println("");

    }
}
