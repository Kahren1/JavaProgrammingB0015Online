package day18;

public class WhileLoopReview {
    public static void main(String[] args) {
        int x=10;

        while  (x>5){
            System.out.println("It's more than 5");
            System.out.println("x =" + --x);
        }
        System.out.println("the end");
    }
}
