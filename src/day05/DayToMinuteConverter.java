package day05;

import java.util.Scanner;

public class DayToMinuteConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me the number of days as an int");
        int numberOfDays = scanner.nextInt();
        int numberOfMinutes = numberOfDays * 1400;
        System.out.println(numberOfDays + "days equals " +numberOfMinutes);
    }
}
