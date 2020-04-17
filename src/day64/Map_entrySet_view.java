package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_entrySet_view {

    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Apple", 1.89);

        //get entrySet() view
        //get your K-V pair into Entry from java.util.Map
        //Map is not Iterable, it order to iterate over map, need something like Set
        //Map stores k-v pair as Entry internally
        //get this Entries out using entrySet()view
       // the Entry Set View is Iterable
        //so we can perform operation on key value pair together
Set< Map.Entry<String, Double>> entryView=groceryPriceMap.entrySet();
        for(Map.Entry<String, Double>each:entryView) {
            System.out.print("Key for current entry is "+ each.getKey()+" value is ");
            System.out.println(each.getValue());

            //update the value of grocery to 15 USD if the grocery name has exactly 5 characters
           if(each.getKey().length()==5)
               each.setValue(15.0);
            //entySet() gives you k-v together
            //we are not iterating over a map, we are iterating over a set, a set of Entry(ies)
        }
        System.out.println("groceryPriceMap  "+groceryPriceMap);

    }
}
