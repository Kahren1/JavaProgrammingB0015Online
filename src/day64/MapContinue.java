package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapContinue {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Apple", 1.89);
        //Map view:
        //keySet view, values view, entrySet view
        //How do I store just the keys into a Collection?
        //--Set - because the keys are unique

        //use keySet() method of Map to get Set of Keys
        //прикольный метод = provides the keyset view of the original map
       Set<String> allNames=groceryPriceMap.keySet();
//        System.out.println("allNames w tomato = " + allNames);
//        allNames.remove("Tomato");
//        System.out.println("allNames w/o tomato"+allNames);

        System.out.println("groceryPriceMap after removal = "+groceryPriceMap);
        
        // to protect the original get a copy of the set into a different object
        Set<String> namesCopy = new HashSet<>(allNames);
        System.out.println("namesCopy = " + namesCopy);


    }
}
