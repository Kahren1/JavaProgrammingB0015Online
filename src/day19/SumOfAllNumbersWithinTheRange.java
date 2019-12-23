package day19;

public class SumOfAllNumbersWithinTheRange {
    public static void main(String[] args) {
        //get the sum of numbers from 1-10

        //ask for two numbers, get the sum of numbers within the range
      int numbersSum = 0;
        for(int i=1;i<=100;i++){
            numbersSum+=i;
        }
        System.out.println(numbersSum);
    }
}
