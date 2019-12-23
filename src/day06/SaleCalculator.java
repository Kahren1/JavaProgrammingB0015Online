package day06;

import java.util.Scanner;

public class SaleCalculator {
    //release at 11:31am
    public static void main(String[] args) {
        double regularPrice, salePrice, discountPercentage, finalPrice;
        Scanner scanner = new Scanner (System.in);
        System.out.println("What is the regular price?");
        regularPrice = scanner.nextDouble();
        System.out.println("What is the discount percentage? For example: 0.2 or 0.3 or 0.1");
        discountPercentage = scanner.nextDouble();
        finalPrice = regularPrice*(1-discountPercentage);
        System.out.println("The final price is: " +finalPrice);




    }
}
