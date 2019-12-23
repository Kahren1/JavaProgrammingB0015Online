package day17;

import java.util.Scanner;

public class SkipCounting {
    public static void main(String[] args) {

        //skip counting by 3
        //from 0 till 30
        int skipVariable = 0;
        while (skipVariable <= 30) {
            System.out.println(skipVariable);
            skipVariable += 3;
        }

        //print out an even number between from 0 to 50 if even is entered, odd if odd is entered

        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number between 0 and 50");
        int x = scan.nextInt();
        if (x % 2 == 0) {
            while (x >= 0 && x <= 50) {
                System.out.println(x);
                x += 2;
            }
        } else{
            while (x > 0 && x <= 50) {
                System.out.println(x);
                x += 2;
            }
        }
        int y = 0;

        while(y<50){
            y++;
            if (y%2==0)
                System.out.println("even " +y);
            else
                System.out.println("odd "+y);
        }


    }
}
