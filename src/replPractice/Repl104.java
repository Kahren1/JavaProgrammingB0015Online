package replPractice;

import java.util.Scanner;

public class Repl104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();
        String firstName;
        String lastName;
        String jsonCut;
        String jsonCut1;
        String firstNamePlus;
        String lastNamePlus;


        jsonCut = json.substring(json.indexOf("firstName"));
        jsonCut1 = jsonCut.substring(jsonCut.indexOf(":"));
        firstNamePlus = jsonCut1.substring(jsonCut1.indexOf("\"") + 1);

       firstName = firstNamePlus.substring(0, firstNamePlus.indexOf("\""));




        jsonCut = json.substring(json.indexOf("lastName"));
        jsonCut1 = jsonCut.substring(jsonCut.indexOf(":"));
       lastNamePlus = jsonCut1.substring(jsonCut1.indexOf("\"")+1);
       lastName = lastNamePlus.substring(0, lastNamePlus.indexOf("\""));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);

    }
}
