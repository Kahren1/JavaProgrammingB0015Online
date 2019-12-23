package day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        //5/2 is two and the remainder is 1
        System.out.println(5%2);

        int minutes;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me minutes");
        minutes= scanner.nextInt();
        int hours = minutes/60;
        int remainderMinutes = minutes%60;
        System.out.println(minutes + " minutes equal to " +hours + " hour(s) " + remainderMinutes + " minute(s)");

    }
}
