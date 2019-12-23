package day13;

public class WarmUp_AmazonShippingCalculator2 {
    public static void main(String[] args) {
        //create a boolean store the result of doYouWantToShop
        //if yes, do you want to go to Store or do you want to shop online
        //if user do not want to shop at all, print good job stay home coding!!

        boolean isWantingToShop = true;
        String preference = "online";

        if (isWantingToShop) {
            if (preference.equalsIgnoreCase("Store")) {
                System.out.println("shop in store");
            } else {
                System.out.println("shop online");
            }
        } else {
            System.out.println("good job, stay home coding");

        }
    }
}
