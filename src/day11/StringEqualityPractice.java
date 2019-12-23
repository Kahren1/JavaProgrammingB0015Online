package day11;

import java.sql.SQLOutput;

public class StringEqualityPractice {
    public static void main(String[] args) {
        String myStr = "Java";
        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");

        System.out.println("Is my String same as your String? ");
        //how to compare myStr to yourStr for equality
        if (myStr.equals(yourStr))
            System.out.println("match!");
        else
            System.out.println("no match!");

        myStr = "Kava";
        switch (myStr) {
            case "Java":
                System.out.println("Correct!");
                break;
            case "Kava":
                System.out.println("Pumpkin!");
                break;
            default:
                System.out.println("Not Java nor Pumpkin");
        }

    }
}
