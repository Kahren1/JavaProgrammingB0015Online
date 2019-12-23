package day31;

public class SeasonChecker {
    public static void main(String[] args) {
        //let's pass summer
        String mySeason="Summer";
        decideSeasonAction(mySeason);
        //now let's pass winter
        mySeason="Winter";
        //lets call a method
        //below is a method caller
        decideSeasonAction(mySeason);

    }
    /*
     * write a static method called decideSeasonAction
     * with a one String parameter called season
     * inside the method body:
     * according to the what the user passed it should pass correct action
     */

    public static void decideSeasonAction(String season) {
        switch (season) {
            case "Summer": {
                System.out.println("Summer: Have fun at the swimming pool!");
                break;
            }
            case "Fall": {
                System.out.println("Fall: Rake leaves.");
                break;
            } case "Winter": {
                System.out.println("Winter: Drive with extra caution");
                break;
            } default:
                System.out.println("Invalid season");
        }
    }
}