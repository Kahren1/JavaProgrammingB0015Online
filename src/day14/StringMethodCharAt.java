package day14;

public class StringMethodCharAt {
    public static void main(String[] args) {
        //charAt method of String
        //it will return a characcter at specified location
        String name = "Kahren";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));

        String theName = "Arya";
        char c1 = theName.charAt(0);
        char c2 = theName.charAt(1);
        char c3 = theName.charAt(2);
        char c4 = theName.charAt(3);
        System.out.println(""+c1+c2+c3+c4);
    }
}
