package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {
        System.out.println("my name is " + giveMeMyName());
        int number = 20;
        int doubleNumber = giveMeDoubleValue(number);
        System.out.println("my number is "+ number + " and its double is " +doubleNumber);
        System.out.println("the quotient is: "+ divide2numbers(10,3));

    }

    public static String giveMeMyName() {
        return "Kahren";
    }

    public static int giveMeDoubleValue(int num) {
        return num * 2;
    }

    public static int add2numbers(int num1, int num2){
        return num1+num2;
    }
    public static double divide2numbers(double dividend, double divisor){
        double quotient = dividend/divisor;
        if(divisor == 0){ //handling exception
            return 0.0;
        }
        return quotient;
    }
}
