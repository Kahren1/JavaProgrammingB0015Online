package day31;

public class Calculator_V2 {
    public static void main(String[] args) {
        int i = 15;
        int j = 3;
        char operator ='+';
        calculate( i, j, operator);
        operator = '-';
        calculate(i,j, operator);
        operator = '*';
        calculate (i, j, operator);
        operator ='/';
        calculate(i,j,operator);
    }

    public static void calculate(int i, int j, char operator) {

        switch (operator) {
            case '+': {
                System.out.println("the sum of two addends is: " + (i + j));
                break;
            }
            case '-': {
                System.out.println("the difference of two operands is: " + (i - j));
                break;
            }
            case '*': {
                System.out.println("the product of the two factors is: " + (i * j));
                break;
            }
            case '/': {
                System.out.println("the quotient of the dividend and the divisor is: " + (i / j));
                break;
            }
            default:
                System.out.println("invalid input");
        }


    }
}
