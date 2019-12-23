package day10;

public class MultiBranch_WithSwitch {
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
        //switch on what? the most important question
        //you can switch on byte, char, short, int, String, enum
        switch (itemNumber) {

            case 11:
                System.out.println("you have selected 11");
                order = "Burger";
                //break;
            case 5:
                System.out.println("you have selected 5");
                order = "Coke";
                break;
            default:
                System.out.println("Unknown number");

        }
    }
}
