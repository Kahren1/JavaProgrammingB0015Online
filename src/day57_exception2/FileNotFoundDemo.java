package day57_exception2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Before Try catch");
        Files.readAllLines(Paths.get("file.txt"));

        //java: unreported exception java.io.IOException; must be caught or declared to be thrown
//        try {
//            Files.readAllLines(Paths.get("file.txt"));
//        }catch(IOException e){
//            System.out.println("Exception happened and caught!");
//        }
        System.out.println("After try catch");

    }
}
