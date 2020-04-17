package day60;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;

public class DangerZoneAgain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("the Start");

            //calling method that declares to that it might throw an exception
            readMyFile();


        Thread.sleep(2000);
        System.out.println("The end");

    }//end main

//unchecked exception --> Anything that IS-A Runtime Exception
   // public class KahrenException extends RuntimeException (or any subclass of if){}

    //creating a checked exception type
    //create a subclass of any checked exception with your own name


    //document this method to tell the caller that the file you are about to read might not exist
    //hand consequences by yourself
    //the exception type already exists for this type of situation is called
    //FileNotFoundException from java.util.package
    public static void readMyFile() {
        System.out.println("reading the file in my computer");
        try {
            throw new FileNotFoundException("Kaboom! File is not here!");
        } catch (FileNotFoundException e) {
            System.out.println("Caught you IN readMyFile");
        }

    }
//    class AkbarException extends RuntimeException{
//
//
//        }
//
//    }
}

