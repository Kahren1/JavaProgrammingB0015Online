package day05;

import java.util.Scanner;

public class VariablePractice {
    public static void main(String[] args) {

/*
primitives

whole numbers: byte, short, int, long

fractional: float, double

logical: boolean (true, false

character: char (single character, single quote)

non-primitives: String, Array, Class, Interface

 */

//
////Task 1: Age calculator
//        //given birth year, calculate the age
//        int currentYear = 2019;
//        int birthYear;
//        System.out.println("When were you born?");
//        Scanner scan = new Scanner (System.in);
//        birthYear = scan.nextInt();
//        int age = currentYear - birthYear;
//
//        System.out.println("You were born in " +birthYear + " and your age is " + age);

        //Task 2: you are speeding today
        //read speed limit int speedLimit
        //read current speed int currentSpeed, int overTheLimit
        //output: if 10 mph more than the speed limit
        //let the driver know

        Scanner scan = new Scanner (System.in);

        System.out.println("What is the speed limit?");

        int speedLimit = scan.nextInt();

        System.out.println("What is your current speed?");

        int currentSpeed = scan.nextInt();

        if (currentSpeed-speedLimit > 10){
            System.out.println("you are over the speed limit!");
        }else{
            System.out.println("you are ok");
        }



    }
}
