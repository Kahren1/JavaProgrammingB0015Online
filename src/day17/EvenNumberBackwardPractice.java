package day17;

public class EvenNumberBackwardPractice {
    public static void main(String[] args) {


        int number = 100;

        while (number >= 0) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
            --number;
        }
    }
}
