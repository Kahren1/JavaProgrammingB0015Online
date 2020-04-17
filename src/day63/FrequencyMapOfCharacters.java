package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMapOfCharacters {
    public static void main(String[] args) {


        String str = "The new link for joining class will require you to login to Okta, " +
                "if it asks you to sign in," +
                "please just click on it, it will take you too Okta signin page, once you sign with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER, THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";
//Get the frequency and store into map of <Character, Integer>
        //logic: go over the each char of the str,
        //if it has not bee already entered into a HashMap
        //put the new char as a key and 1 as a value
        //else replace the old value (count) of the key with the old one + 1
        Map<Character, Integer> charFreq = new HashMap<>();
        for(int i=0; i<str.length();i++){
            if(!charFreq.containsKey(str.charAt(i))){
                charFreq.put(str.charAt(i), 1);
            }else
                charFreq.replace(str.charAt(i), charFreq.get(str.charAt(i))+1);
        }
System.out.println(charFreq);





    }//end main
}
