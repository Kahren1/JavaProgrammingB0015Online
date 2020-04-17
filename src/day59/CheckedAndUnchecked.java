package day59;

import java.io.IOException;

public class CheckedAndUnchecked {
    public static void main(String[] args) {
        String x = "abc";
        //System.out.println(x.charAt(100));

        /**
         * Exception Hierarchy
         *
         * Throwable --> child class--> Exception
         *
         * //Under Exception class, there is one sub class known as RuTimeException
         * Anything IS-A RuntimeException regarded as UncheckedException
         * UncheckedException are not required to be handled at compile time
         *
         * try to throw the exception programmatically if it compiles, it is a RuntimeException!
         */
       // throw new RuntimeException("just throwing it out!");

        /**is the class Exception a type of checked exception or unchecked?
         * just try to throw it!
         */
        try {
            throw new IOException("just throwing this away");
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
        //checked - without handling (try-catch) or declaring (document it) it will not compile!
        //Runtime Exception ==unchecked
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep throws exception!");
        }

    }
}

