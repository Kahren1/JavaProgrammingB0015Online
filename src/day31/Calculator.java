package day31;

import java.sql.SQLOutput;

public class Calculator {
    public static void main(String[] args) {
        //create a static method that adds
        //accepts two parameters, prints the result of addition\

        add(2,5);
        substract (3,4);
        multiply(2,4);
        divide (100,10);
    }
    public static void add (int num1, int num2){
        System.out.println("addition result: "+ (num1+num2));
    }

    public static void substract ( int num1, int num2){
        System.out.println("substraction result: " + (num1-num2));
    }

    public static void multiply (int num1, int num2){
        System.out.println("multiplication result: "+(num1*num2));
    }

    public static void divide (int num1, int num2){
        System.out.println("division result: "+ (num1/num2));

    }
}
