package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {
        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;
        System.out.println(myFavoriteNumber + " is my favorite number");
        System.out.println(yourFavoriteNumber + " is your favorite number");
        yourFavoriteNumber = 100;
        System.out.println(yourFavoriteNumber + " is your fave num now");


    }

}
