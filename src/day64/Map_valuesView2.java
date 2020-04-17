package day64;

import java.util.*;

public class Map_valuesView2 {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        Collection<Double> allPrices = groceryPriceMap.values();
        List<Double> allPrices2 = new ArrayList<>(allPrices);

        //remove all entry of the groceryPriceMap if the price value is >3
        //removing from List because it is backed by Map
        allPrices.removeIf(each -> each > 3.00);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

//       for(int i=0;i<allPrices2.size();i++){
//          if(allPrices2.get(i)<2.00){
//              allPrices.remove(allPrices2.get(i));
//           }
//        }
//        System.out.println("groceryPriceMap = " + groceryPriceMap);

        Iterator<Double> allPricesIter = allPrices.iterator();
        while (allPricesIter.hasNext()) {
            double temp = allPricesIter.next();
            if (temp < 2.00) {
                allPricesIter.remove();
            }
        }
        System.out.println("groceryPriceMap = " + groceryPriceMap);


    }//end main
}
