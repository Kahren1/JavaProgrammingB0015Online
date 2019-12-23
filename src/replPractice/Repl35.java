package replPractice;

import java.util.Scanner;

public class Repl35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int price = 0;
        boolean isItemListed = true;

        if (item.equalsIgnoreCase("Smartphone"))
            price = 300;
        else if (item.equalsIgnoreCase("Laptop"))
            price = 400;
        else if (item.equalsIgnoreCase("Charger"))
            price = 15;
        else if (item.equalsIgnoreCase("USB cable"))
            price = 10;
        else if (item.equalsIgnoreCase("Headphones"))
            price = 30;
        else if (item.equalsIgnoreCase("Pants"))
            price = 50;
        else if (item.equalsIgnoreCase("Hat"))
            price = 25;
        else if (item.equalsIgnoreCase("Socks"))
            price = 5;
        else if (item.equalsIgnoreCase("Blanket"))
            price = 60;
        else if (item.equalsIgnoreCase("Pillow"))
            price = 40;
        else {
            System.out.println("Invalid item!");
            isItemListed = false;
        }


        if (price > 100) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(isItemListed==true) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - price) + "$");
        }

    }
}


