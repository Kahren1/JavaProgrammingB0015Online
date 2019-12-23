package day08;

public class WarmUpTask {
    public static void main(String[] args) {
        //voting eligibility program
        int age;
        age = 18;
        System.out.println(age >= 18);
        if (age >= 18) {
        System.out.println("You are ready to vote!");
    }else {
            System.out.println("Wait till you are 18!");
        }
/* favorite number guessing game
 */
        int myFavoriteNumber = 10;
        System.out.println("Guess the number!");
        if(myFavoriteNumber==10)
            System.out.println("Bingo");
        else
            System.out.println("Try again!");


    }

}
