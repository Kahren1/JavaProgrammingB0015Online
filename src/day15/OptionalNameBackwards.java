package day15;

import java.util.Scanner;

public class OptionalNameBackwards {
    public static void main(String[] args) {
        String name = "Akbar";
        System.out.println(""+ name.charAt(0)+
                name.charAt(1) +
                name.charAt(2) +
                name.charAt(3) +
                name.charAt(4));
        int nameLength = name.length();
        //reverse
        System.out.println(""+ name.charAt(4)+
                name.charAt(3) +
                name.charAt(2) +
                name.charAt(1) +
                name.charAt(0));

    }
}
