package replPractice;


import java.util.Scanner;

public class Repl77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String domain = email.substring(email.indexOf('@')+1, email.indexOf("."));
        String topLevelDomain = email.substring(email.indexOf(".")+1);
        String firstNameFirstLetter = ""+firstName.charAt(0);
        firstNameFirstLetter = firstNameFirstLetter.toUpperCase();
        String lastNameFirstLetter = ""+lastName.charAt(0);
        lastNameFirstLetter = lastNameFirstLetter.toUpperCase();
        firstName = firstNameFirstLetter+ firstName.substring(1);
        lastName = lastNameFirstLetter + lastName.substring(1);

        System.out.println("First name: " +firstName);
        System.out.println("Last name: "+ lastName);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + topLevelDomain);

//        String b=email.charAt(0)+"";
//        String c=""+email.charAt(email.indexOf("_")+1);
//        System.out.println("First name: "+b.toUpperCase()+email.substring(1,email.indexOf("_")));
//        System.out.println("Last name: "+c.toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")));
//        System.out.println("Domain: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
//        System.out.println("Top-Level Domain: "+email.substring(email.indexOf(".")+1,email.length()));

    }
}
