package day13;

public class StringMethods {
    public static void main(String[] args) {
        //equals
        String s1 = "hello";
        System.out.println(s1.equals("abc"));
                //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("Hello"));

        //toUpperCase method
        System.out.println(s1.toUpperCase());

        //toLowerCase
        System.out.println(s1.toLowerCase());

        //character count of a String
        System.out.println(s1.length());

        //store your name into a variable
        //print name in all uppercase
        //concatenate "my name is: YOURNAME
        //print your name in all lowercase:
        //optionally concatenate "my name is : yourname"

        String myName = "Карен";
        System.out.println("my name is: " + myName.toUpperCase());

        System.out.println("my name is: " + myName.toLowerCase());

        System.out.println(s1.length());
        int lengthOfString = s1.length();

        if(lengthOfString>4)
            System.out.println("name longer than 4 characters");
        else
            System.out.println("name is no longer than 4 characters");




    }
}
