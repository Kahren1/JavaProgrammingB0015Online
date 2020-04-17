package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Practice {
    public static void main(String[] args) {
        //SortedMap extends Map and it will keep the sorted order
        //TreeMap is the implementation class
        SortedMap<String, Double> groceryPriceMap = new TreeMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Apple", 1.89);
//sort by natural order of key datatype
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        //interview question: What is the difference between
        // HashMap (regular k-v data structure, w unique keys),
        // LinkedHashMap(slightly slower, keeps insertion order),
        // Treemap (slowest, SortedMap implementaton, keeps sorted order)
        //HashMap and HashSet - fundamentally different data structures
        //HashSet - implementation of Set interface
        //HashMap = implementation of Map interface
        //is stores k-v pair
    }
}
