package day63;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
       Map<String,String> nameAndStatePair = new HashMap<>();
      //Compared to List, Set stores single element per item
      //Map store key-value pair per item
        //one data type for the key, one for the value

        Map <Integer, String> groupNumLeaderNamPair = new HashMap<>();

        Map<String, Double> groceryNameAndPricePair = new HashMap<>();

        Map <String, Integer> nameAgePair = new HashMap<>();

        Map <Byte, Character> questionAndCorrectAnswer = new HashMap<>();

        //adding elements:put
        nameAgePair.put("Zehra", 66);
        nameAgePair.put("Aehra", 6);
        nameAgePair.put("Behra", 7);
        nameAgePair.put("Lehra", 61);
        nameAgePair.put("Borisehra", 26);
        nameAgePair.put("Zzzehra", 678);

        System.out.println(" first ever nameAgePair = " + nameAgePair);

        //adding an item, making sure there is no such value already to prevent replacement
        nameAgePair.putIfAbsent("Zehra", 2);

        System.out.println("nameAgePair="+nameAgePair);
        //getting the size of the map
        System.out.println("size is: "+nameAgePair.size());

        //How do we get a value according to the key?
        System.out.println("Zehra's age = "+nameAgePair.get("Zehra"));

        nameAgePair.put("Zehra", 100);
        System.out.println("after putting a new Zehra her age is = " + nameAgePair.get("Zehra"));

        //the key of the Map is unique,
        // instead of accepting a duplicate, it replaces the old value with the new one
        //checking is the key already exists
        System.out.println("nameAgePair.containsKey(\"Lehra\") = "+nameAgePair.containsKey("Lehra"));
        System.out.println("nameAgePair.containsKey(\"Kahren\") = " + nameAgePair.containsKey("Kahren"));

        //updating the element (replacing the value) in the Map using replace
        nameAgePair.replace("Behra", 1999);
        System.out.println("updated age: "+nameAgePair.get("Behra"));

        //use replace to update existing value
        //put might accidentatlly add a new k-v pair is misspel the existing key

        //updating the value only if the old value matches
        nameAgePair.replace("Lehra", 61, 2);
        System.out.println("updated age: "+nameAgePair.get("Lehra"));

        System.out.println("nameAgePair.containsKey(\"Aehra\") = " + nameAgePair.containsKey("Aehra"));
        //removing an entry (k-v pair is called an entry)
        nameAgePair.remove("Aehra");

        System.out.println("nameAgePair.containsKey(\"Aehra\") = " + nameAgePair.containsKey("Aehra"));

//don't use the get method to check whether you have the entry
        //because if you don't have the key you will get null
        //but you will also get a null if the Value is null

    } //end main
}
