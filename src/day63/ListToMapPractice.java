package day63;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapPractice {
    public static void main(String[] args) {
        List<String> groupMembers = Arrays.asList("Vasya", "Petya", "Grisha");
//create a Map with name and character count pair
        Map<String,Integer> nameCharCountPair=new HashMap<>();
        for(String each:groupMembers){
            nameCharCountPair.put(each,each.length());
        }
        System.out.println("nameCharCountPair = " + nameCharCountPair);
    }
}
