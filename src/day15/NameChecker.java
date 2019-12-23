package day15;

import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myName = scan.next();
        int nameLength = myName.length();
        System.out.println("my name length is: " +nameLength);

        if (nameLength<4)
            System.out.println("short name");
        else if (nameLength>=5&&nameLength<=11)
            System.out.println("medium name");
        else if (nameLength>11)
            System.out.println("longer name");

        if (myName.contains("a")||myName.contains("e"))
            System.out.println("name contains a or e");
        else
            System.out.println("I don't have a or e in my name");

    }
}
