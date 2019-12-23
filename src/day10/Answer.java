package day10;

public class Answer {
    public static void main(String[] args) {
       String myAnswer = "";

       int myNumber = 301;

       if (myNumber%5==0){
           myAnswer = "FizzNumber";
        }else{
           myAnswer = "not a FizzNumber";
        }
        System.out.println("my number is " + myNumber + ", It is "+ myAnswer);
    }
}
