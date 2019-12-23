package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {

        int [] numbers = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("give me the number for element with index " + i +" ");
            numbers[i] = scan.nextInt();
        }
        System.out.println(" ");
        for(int j = numbers.length-1; j>=0; j--){
            System.out.println(numbers[j] + " ");
        }
    }
}
