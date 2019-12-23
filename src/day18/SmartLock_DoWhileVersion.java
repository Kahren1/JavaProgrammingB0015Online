package day18;

import java.util.Scanner;

public class SmartLock_DoWhileVersion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String passwordTry;
        int counter = 1;

        do{
            System.out.println("Enter the password ");
            passwordTry = scan.next();
            System.out.println("Attempt No. " +counter++);

        }while(!passwordTry.equals("B15"));
        System.out.println("Success");

    }
}
