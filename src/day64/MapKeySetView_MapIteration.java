package day64;

import java.util.*;

public class MapKeySetView_MapIteration {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Apple", 1.89);

        //Map is not Iterable, we can't directly iterate over item
        //but keySet view returns a Set of key datatype ( Set<String> in this case) and it's iterable
        //so, to iterate over the Map, we need to get something Iterable from it

        Set<String> allNames = groceryPriceMap.keySet();
        System.out.println("Iterating using the keyset: ");
        for(String each:allNames) {
            System.out.println(each + " " + groceryPriceMap.get(each));
        }
            //get all the values in the map and store it to Collection
            //use the values() method from the map, it will return
            //a same Collection object that contains all the values
            //same thing, diffent view то же самое, вид сбоку
            //values method returns a Collection! that's why we have Collection dataType on the left
            Collection<Double> allPrices = groceryPriceMap.values();
            System.out.println("allPrices = "+ allPrices);

            //if I want no connection, copy allPrices into different Collection object
            //List<Double> pricesCopy = new ArrayList<>(allPrices);
            List<Double> pricesCopy = new ArrayList<>(groceryPriceMap.values());

            //remove anything>3 USD
            //lambda, something that involve predicate
            allPrices.removeIf(eachPrice -> eachPrice>3);
            System.out.println("groceryPriceMap after removal>3=  " +groceryPriceMap);

            //here we use the strict connection between the vew and the original map
            //iterate over the allPrices and check the condition >3
            //can't remove insed the for each loop
            //1.removeIf with lambda expression, or to user Iterator
            Iterator<Double> itr = allPrices.iterator();
            while(itr.hasNext()){
                itr.next();
                itr.remove();
            }



    }
}
