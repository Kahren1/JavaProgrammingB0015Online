package day07;

public class EmailBuilder {
    public static void main(String[] args) {


        String firstName, lastName, company, emailAddress;
        firstName = "Steve";
        lastName = "Jobs";
        company = "apple";
        emailAddress = firstName + "_" + lastName + "@" + company + ".com";
        System.out.println( "my name is: " + firstName + " " +lastName +
                " and I work for " + company + " and my email is " +emailAddress);
    }
}
