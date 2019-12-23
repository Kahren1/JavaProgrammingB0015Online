package day07;

public class Casting {
    public static void main(String[] args) {

        //int num = 10;
        double bigNum = 10;
        System.out.println(bigNum);

        //12.99 is a double, a double has much bigger range than an int
        int num = (int) 12.99;
        System.out.println(num);
        //casting is converting one data type, storing into another data type
        //smaller data type to a bigger data type => type widening or upcasting
        //this is done implicitely in Java

//        12.99 is a double, can't be stored inside an int
//            attempt to do it implicitely results in a compiler error
        //so we need to explicitely tell a compiler we are ok with potentially losing data.
        //(int) 12.99 --> 12  int x = (int)12.99;  the number gets trunkated
        long earthToMoon = 10_000; //10_000L
        //create an int variable and try to store above long
        int earthToMoonIn_int = (int)earthToMoon;
        System.out.println(earthToMoonIn_int);
//
        //Special case of char to int
        //char aChar = 'a';
        //int n = aChar; <-- kosher, widening primitive conversion

        //narrowing primitive conversions has to be explicit cast
        //char has narrower range
        //char aChar = (char)n;
    }
}
