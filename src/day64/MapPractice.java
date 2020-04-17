package day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        //wh if we want to have multiple values for one key
        //for example groupCode (bugHunter) -- group member names (abc, efg, htj, knl)
        //k-v     String, List<String>
        //key data type is String, value data type is List<String>;
        Map<String, List<String>> groupMap = new HashMap();
        groupMap.put("PowerOf4", Arrays.asList("Furkan", "Daria", "Serife", "Muge") );
        groupMap.put("BugHunter", Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like"));
        groupMap.put("Achievers", Arrays.asList ("Georgiy"));
        groupMap.put("BugBusters", Arrays.asList("Vasya", "Petya"));

        System.out.println("groupMap "+groupMap);
        System.out.println();
        groupMap.forEach((groupCode, names)->System.out.println(groupCode+"\t"+names));

//get Zaki
        System.out.println(groupMap.get("BugHunter").get(2));

        //does "BugBusters contain Vasya?
        //get() comes form Map, contains() comes from List
        System.out.println("Bugbusters contain Vasya? "+ groupMap.get("BugBusters").contains("Vasya"));

        //add to groupMap another, new group "Justice League" with resizable List






        groupMap.put("Justice League", new ArrayList<>(Arrays.asList("Superman", "WonderWoman")) );
        //add new members to "Justice League"
        groupMap.get("Justice League").add("Flash");
        System.out.println("members of Justice League: "+ groupMap.get("Justice League"));

        //the key for the Map should be of an Immutable type, otherwise the hash value will change - no can do.






    }
}
