package day12;



public class CheckingStringEqualityWithoutCase {
    public static void main(String[] args) {
        String myName = "Kahren";

        boolean isMyNameCorrect = myName.equals("KAHREN");
        System.out.println(isMyNameCorrect + " - case sensitive name comparison");

        boolean isMyNameIgnoreCaseCorrect = myName.equalsIgnoreCase("KAHREN");
        System.out.println(isMyNameIgnoreCaseCorrect + " case insensitive name comparison");

    }
}
