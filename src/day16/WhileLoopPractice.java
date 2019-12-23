package day16;

public class WhileLoopPractice {

    public static void main(String[] args) {

        int x=100;
        int iterationCount = 1;
        while(x<105){
            System.out.println("Hello, World");
            System.out.println("iteration count: " + iterationCount++);
            x++;
        }
    }
}
