package day10;

import java.util.Scanner;

public class SeasonAction {
    /*
    Spring: hike Easter, Nawruz, Blossom
    Summer: swim, vacation, BBQ, holiday
    Fall: Black Friday, Hiking, Harvest, Halloween, Shopping
    Winter: Snowboarding, Ski, Christmas, New Year
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Season, please");
        String season = scan.next();
        //switching on String season
        switch (season) {
            case "Spring":
                System.out.println("hike, Easter, Nawruz, Blossom");
                break;
            case "Summer":
                System.out.println("swim, vacation, BBQ, holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, Hiking, Harvest, Halloween, Shopping");
                break;
            case "Winter":
                System.out.println("Snowboarding, Ski, Christmas, New Year");
                break;
            default:
                System.out.println("wrong input");
        }

    }

}
