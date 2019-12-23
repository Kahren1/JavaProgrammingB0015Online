package day12;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        String season;
        System.out.println("Enter your season, please!");
        Scanner scanner = new Scanner(System.in);
        season = scanner.next();

        if (season.equalsIgnoreCase("Spring"))
            System.out.println("Hiking, Navruz, Allergy season, cool weather");
        else if (season.equalsIgnoreCase("Summer"))
            System.out.println("pool, swimming, beach, vacation");
        else if (season.equalsIgnoreCase("Fall"))
            System.out.println("barbecue, riding bike, Just code!!! Halloween");
        else if (season.equalsIgnoreCase("Winter"))
            System.out.println("Code!!! Ski, sledding, snowman");
        else
            System.out.println("don't recognize the season");

    }
}
