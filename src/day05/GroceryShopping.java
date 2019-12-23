package day05;


import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Price of tomato?");
        double priceTomato = scanner.nextDouble();

        System.out.println("How many tomatoes?");
        int tomatoCount = scanner.nextInt();

        System.out.println("Price of potato?");
        double pricePotato = scanner.nextDouble();

        System.out.println("How many potatos?");
        int potatoCount = scanner.nextInt();

        System.out.println("Price of banana?");
        double priceBanana = scanner.nextDouble();

        System.out.println("How many bananas?");

        int bananaCount = scanner.nextInt();



        System.out.println("You got " + tomatoCount + " tomatos, the price is "+ priceTomato + " and the total is $" +
                (tomatoCount*priceTomato));
        System.out.println("You got " + potatoCount + " potatoes , the price is " +pricePotato + " and the total is $" +
                (potatoCount*pricePotato));

        System.out.println("You got " + bananaCount + " bananas , the price is " +priceBanana + " and the total is $" +
                (bananaCount*priceBanana));

        System.out.println("Your grand total for this shopping is $"+
                (tomatoCount*priceTomato + potatoCount*pricePotato + bananaCount*priceBanana));




    }
}
