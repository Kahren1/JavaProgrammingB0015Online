package day06;

import java.util.Scanner;

public class RemainderPractice {
    public static void main(String[] args) {
        //you have 2 dollars
        //how many dimes you in change
        //how many nickels in change
        //pennies in change

        int currencyInCents = 200;
        System.out.println("purchase in cents, pls");
        Scanner scanner = new Scanner (System.in);
        int purchase = scanner.nextInt();


        int dollarChange = currencyInCents - purchase;
        int quarterCount = dollarChange/25;
        int dimeCount = (dollarChange%25)/10;
        int nickelCount = ((dollarChange%25)%10)/5;
        int pennyCount = ((dollarChange%25)%10)%5;

        System.out.println(quarterCount + " quarters " +dimeCount +
                " dimes " + nickelCount + " nickels " + pennyCount + " pennies");
    }
}
