package day17;

import java.util.Scanner;

public class WarmUp_FullNameCorrector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Gimme full name: ");

        String fullName = scan.nextLine();

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        int index = fullName.indexOf(" ") +1;
        String lastName = fullName.substring(index);
        System.out.println(firstName + " separated from " +lastName);

        firstName = firstName.toUpperCase().substring(0,1)+firstName.toLowerCase().substring(1);
        lastName = lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);

        System.out.println(firstName + " " +lastName);
    }
}
