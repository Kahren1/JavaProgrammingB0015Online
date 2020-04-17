package day59;

import java.util.Scanner;

public class ExceptionPracticeWMain {
    public static void main(String[] args) {
        System.out.println("The start - this program will get certain character from Furkan's name" +
                "according to user-provided index");
        String name = "Furkan";
        //System.out.println("number 100 char of name is "+name.charAt(100));

        /**

         * 	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
         * 	at java.base/java.lang.String.charAt(String.java:709)
         * 	at day59.ExceptionPracticeWMain.main(ExceptionPracticeWMain.java:6)
         */
//Exceptions are objects too :)
        //we can create objects ourselves, like with any other class
        //StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
        //System.out.println(e1.toString());

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index do you want to get from Furkan's name?");
        int targetIndex = scan.nextInt();
        try {
            System.out.println(name.charAt(targetIndex));
        }catch(Exception e){
            System.out.println("String from getMessage() method:" +e.getMessage());
            System.out.println("Something unusual happened!!!");
        }
        /**
         *we want to take different actions depending on
         * we can have more than one catch block
         *  to handle different type of exception
         *  and take action according to the exception type at runtime

         */



    }
}
