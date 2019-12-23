package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald's, what can I get for you?");
        /*
        11, Burger
        5, French fries
        8, Nuggets
        35, Ice cream
         */
        String order = "";
        int itemNumber = 11;

        if (itemNumber == 11) {
            System.out.println("You have selected 11");
            order = "Burger";
        } else if (itemNumber == 5) {
            System.out.println("You have selected 5");
            order = "French fries";
        } else if (itemNumber == 8) {
            System.out.println("You have selected 8");
            order = "Nuggets";
        } else if (itemNumber == 35) {
            System.out.println("You have selected 35");
            order = "ice cream";
        } else {
            System.out.println("Unknown number selected");
            order = "unknown";
        }
        System.out.println("You ordered " + order);
    }
}
