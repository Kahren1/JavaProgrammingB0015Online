package day13;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {
        /*
        Amazon has 2 types of users: one is a Prime member and another is a regular member
        prime members get free shipping on all purchases no matter the amount
        regular member users get free shipping only if their purchase is more than $25
        otherwise they are charged %5 shipping fee
         */

        String memberType = "Prime member";
        double amount = 15.99d;
        int shippingFee;
        if (memberType.equalsIgnoreCase("PRIME MEMBER")) {
            System.out.println("you get 1 day free shipping!");
            System.out.println("your final price is " + amount);
        } else if (amount > 25) {
            System.out.println("Not a prime member but your order is more than 25");
            System.out.println("you got free shipping on amount" + amount);
        } else {
            System.out.println("Do you want to sign up for prime membership?");
            shippingFee = 5;
            amount = amount +shippingFee; //amount +=shippingFee;
            System.out.println("Your final amount is "+ amount);

        }
    }
}
