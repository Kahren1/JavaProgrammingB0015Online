package replPractice;

import java.util.Scanner;

public class Repl77_v2 {
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String email = scan.next();
                String b=email.charAt(0)+"";
                String c=""+email.charAt(email.indexOf("_")+1);
                System.out.println("First name: "+b.toUpperCase()+email.substring(1,email.indexOf("_")));
                System.out.println("Last name: "+c.toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")));
                System.out.println("Domain: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
                System.out.println("Top-Level Domain: "+email.substring(email.indexOf(".")+1,email.length()));


    }
}
