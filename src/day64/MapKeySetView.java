package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapKeySetView {
    public static void main(String[] args) {
        Map<String,Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Apple", 1.89);

        //Map view:
        //keySet view, values view, entrySet view
        //to store unique keyw Set will be the appropriate data type
        //this is a keyset view of my map still connected to (backed by) the original map
        //if I update a set, the original Map will be updated as well
        Set<String> allNames = groceryPriceMap.keySet();
        System.out.println("allNames = " + allNames);
        allNames.remove("Tomato");

        System.out.println("allNames no Tomato = " + allNames);
        System.out.println("groceryPriceMap no Tomato = " + groceryPriceMap);

        //What if we don't want Set to be backed by the original map
        //Dump the set into another set creating another object
        Set<String> allNamesCopy = new HashSet<>(allNames);
        //System.out.println(new HashSet<>(groceryPriceMap.keySet()));
        allNamesCopy.remove("Potato");
        System.out.println();
        System.out.println("allNamesCopy = " + allNamesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);




    }
}
