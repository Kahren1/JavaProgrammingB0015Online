package day07;

public class PreAndPostIncrement {
    public static void main(String[] args) {
        //increment apple
        int apple = 8;
        apple++;
        System.out.println(apple);

        int score = 50;
        System.out.println(++score); //51
        System.out.println(score++); //51, 52 next time it is used

    }
}
