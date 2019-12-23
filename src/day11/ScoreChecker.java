package day11;

public class ScoreChecker {
    public static void main(String[] args) {
        int score = 50;

        if(score<0||score>100)
            System.out.println("Invalid score!");
        else if(score==100)
            System.out.println("Perfecto!");
        else if(score>70 && score<100)
            System.out.println("Passed!");
        else
            System.out.println("You failed!");
    }
}
