package day16;

public class WhileLoopIntro {
    public static void main(String[] args) {
        //print hello world 5 times
        int count =1;

        while(count <= 5){
            System.out.println("hello world");
            System.out.println("count is: "+count);
            System.out.println(count++);
            System.out.println("count now is: "+count);

        }
    }
}
