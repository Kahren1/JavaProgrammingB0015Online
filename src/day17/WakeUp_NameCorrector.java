package day17;

import java.util.Scanner;

public class WakeUp_NameCorrector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gimme your first name, random upper and lower case");
        String name = scan.next();
        String name2 = name.toLowerCase();
        String firstLetterUpperCase = name2.toUpperCase().substring(0,1);
        name2 = firstLetterUpperCase+ name2.substring(1);
        System.out.println("name2 = " + name2);


    }
}
