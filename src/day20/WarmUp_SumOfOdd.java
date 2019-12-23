package day20;

public class WarmUp_SumOfOdd {
    public static void main(String[] args) {
        //calculating the sum of even and the sum of odd
    int sum=0;
    int sumOfEven = 0;


    for(int i=10; i<=100; i++){

        if (i % 2 == 1) {
            sum += i;
        }else
            sumOfEven+=i;
    }
        System.out.println("sum = " + sum);
        System.out.println("sumOfEven = " + sumOfEven);
    }
}
