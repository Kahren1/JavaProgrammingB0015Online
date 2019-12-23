package day24;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name = "Alesya";
        //how would you store each char in a char array

        char [] nameChars = new char [name.length()];

        for (int i = 0; i < name.length(); i++) {
            nameChars[i]=name.charAt(i);
        }
        System.out.println("nameChars = "+ Arrays.toString(nameChars));

        System.out.println(Arrays.toString(name.toCharArray() ));
    }
}
