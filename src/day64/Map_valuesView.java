package day64;

import java.util.*;

public class Map_valuesView {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Apple", 1.89);

        //in order to get all the values in the map and store it to collection
        //use values method from the Map
        //values method returns a Collection object with values

        Collection<Double> allPrices = groceryPriceMap.values();
        System.out.println("allPrices = " + allPrices);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        allPrices.remove(1.99);
        System.out.println("groceryPriceMap after removal = " + groceryPriceMap);

        //List <Double>allPricesCopy= new ArrayList<>(allPrices);
        List<Double> allPricesCopy = new ArrayList<>(groceryPriceMap.values());

    }//end main
}
