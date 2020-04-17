package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingCharactersShowingUpAtLeastOnce_V2 {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, " +
                "if it asks you to sign in," +
                "please just click on it, it will take you too Okta signin page, once you sign with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER, THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        Set<Character> chars = new HashSet<>(Arrays.asList('A', 'A', 'A', 'A', 'A', 'A', 'A'));
        System.out.println("chars = " + chars);
        chars.forEach(each -> System.out.println("chars has: " + each));

        //can't do Characters, have to do Strings
        List<String> strLst = Arrays.asList(str.split(""));
        Set<String> charSet = new HashSet<>(strLst);
        System.out.println("charSet using the HashSet = " + charSet);
        System.out.println("one shot way"+ new HashSet<>(Arrays.asList(str.split(""))));
    }
}
