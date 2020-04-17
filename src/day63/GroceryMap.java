package day63;

import java.util.HashMap;
import java.util.Map;

public class GroceryMap {
    public static void main(String[] args) {
//Hash - no order
       Map<String, Double> groceryPriceMap = new HashMap<>();
       groceryPriceMap.put("cucumber", 1.60 );
       groceryPriceMap.put("orange", 2.00);
       groceryPriceMap.put("tomato", 3.00);
       groceryPriceMap.put("cucumber", 99.00);
       groceryPriceMap.putIfAbsent("orange", 1.23);
        groceryPriceMap.putIfAbsent("tomato", 4.00);


        System.out.println("Number of entries in a grocery price map: "+groceryPriceMap);
        //no order in printing
        //see no diffence in using toString()
        System.out.println(groceryPriceMap.toString());

        //getting the 3rd item - no indexes in the map
        //so will just look at the third we added

        System.out.println("tomato price: "+groceryPriceMap.get("tomato"));
        //doubling tomato price
        System.out.println(groceryPriceMap.replace("tomato", groceryPriceMap.get("tomato")*2));
        System.out.println("tomato price: "+groceryPriceMap.get("tomato"));

        //getting the first item on sale $1 less
        System.out.println("old value returned "+groceryPriceMap.replace("cucumber",groceryPriceMap.get("cucumber")-1));
        System.out.println(groceryPriceMap.get("cucumber"));


        //removing tomato
        if(groceryPriceMap.containsKey("tomato")) {
        groceryPriceMap.remove("tomato");}

        System.out.println(groceryPriceMap);
        System.out.println("is tomato key there? "+groceryPriceMap.containsKey("tomato"));


    }//end main
}
