package day63;

import java.util.Arrays;

import java.util.*;

public class FindingUnique {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, " +
                "if it asks you to sign in," +
                "please just click on it, it will take you too Okta signin page, once you sign with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER, THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        //How many unique charachters showed up in above sentence?
Set<Character> charSet = new LinkedHashSet<>();
for(int x=0;x<str.length();x++){
    charSet.add(str.charAt(x));
}
        System.out.println("charSet = " + charSet);
        System.out.println("How many unique characters? " +charSet.size());
        System.out.println("How many total characters? "+str.length());

        charSet.forEach(each-> System.out.print(each+" "));


//        String nonDup = new HashSet<>(Arrays.asList(str.split(""))).toString();
//        String final = nonDup.replace(", ","").replace(" ","")
//                .replace("[","").replace("]","");



    }
}
