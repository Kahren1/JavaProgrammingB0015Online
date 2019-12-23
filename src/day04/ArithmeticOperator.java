package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

// arithemetic operation on two ints result in an int
        System.out.println(5 + 3    );
        System.out.println(5 - 3    );
        System.out.println(5 * 3    );
        System.out.println(5 / 3    );

        System.out.println(5 + 3.0d    );
        System.out.println(5 - 3.0d   );
        System.out.println(5 * 3.0d    );
        System.out.println(5 / 3.0d   );
        //arithmetic operation on two numerical data types result in a larger data type

        int operandOne = 5;
        double operandTwo = 3.0;
        printResults(operandOne, operandTwo);
        //store above numbers in variables,
        //replace above statements with variables instead
    }
    //my method
    static void printResults (int arg1, double arg2) {
        double resultAddition = arg1 + arg2;
        double resultSubstraction = arg1 - arg2;
        double resultMultiplication = arg1 * arg2;
        double resultDivision = arg1 / arg2;
        System.out.println(resultAddition);
        System.out.println(resultSubstraction);
        System.out.println(resultMultiplication);
        System.out.println(resultDivision);
    }


}
