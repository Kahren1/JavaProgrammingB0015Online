package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        //passing array object directly into the method
        printArrayItems(new int[]{1, 6, 5, 3, 12, 3});


    int [] array = {1, 6, 5, 3, 12, 3};
        printSumOfIntArray(array);
        printMinOfIntArray(array);
        printMaxOfIntArray(array);

    }
    //arrayPrinter
    //create a method that has one int array as a parameter
    //print out eah item in the following format
    //arrays has item: ----> all the items here


    public static void printArrayItems(int[] arr) {
        System.out.println("arrays has items: " + Arrays.toString(arr));
    }

    //printMaxOfIntArray
//this method has one int arrray as parameter
//and it will print the max number
    public static void printMaxOfIntArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }

//printMinOfIntArray
//takes one int array
//prints min number
public static void printMinOfIntArray(int[] arr) {
    Arrays.sort(arr);
    System.out.println(arr[0]);
}

//printSumOfIntArray
//takes in one int array
//prints the sum

    public static void printSumOfIntArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}