package replPractice;

import java.util.Scanner;

public class Repl23 {

   public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int areaCode, localNumber;
  System.out.println("Gimme the area code");
        areaCode  = scan.nextInt();
  System.out.println("Now gimme the phone number");
        localNumber= scan.nextInt();

 System.out.println("Calling number (" +areaCode+ ")-"+localNumber);

          }


}
