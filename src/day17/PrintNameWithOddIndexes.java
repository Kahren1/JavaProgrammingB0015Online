package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        int counter = 0;
        while (counter <name.length()){
            if(counter%2==1)
            System.out.println(name.charAt(counter));
            counter++;
        }

    }
}
