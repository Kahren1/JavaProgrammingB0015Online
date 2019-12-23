package day10;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        operator= '+';
        switch(operator){
            case '+':
                System.out.println("you are about to add numbers");
                break;
            case '-':
                System.out.println("you are about to substract numbers");
                break;
            case '*':
                System.out.println("you are about to multiply numbers");
                break;
            case '/':
                System.out.println("you are about to divide numbers");
                break;
            default:
                System.out.println("invalid operator");
        }


    }
}
