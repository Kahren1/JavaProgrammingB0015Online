package day64;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView_Practice {

    public static void main(String[] args) {
        Map<String,String> employeeMap=new HashMap<>();
        employeeMap.put("Darlene", "Female");
        employeeMap.put("John", "Male");
        employeeMap.put("Marsha", "Female");
        employeeMap.put("Pete", "Male");
        employeeMap.put("Vera", "Female");
        employeeMap.put("Mike", "Male");
        employeeMap.put("Oksana", "Female");
        employeeMap.put("Erik", "Male");
        employeeMap.put("Sonia", "Female");
        employeeMap.put("Armen", "Male");
        employeeMap.put("Elza", "Female");
        employeeMap.put("Gregory", "Male");
        employeeMap.put("Aisha", "Female");
        employeeMap.put("Mohammed", "Male");




        System.out.println("employeeMap = "+employeeMap);
        //Task 1: get the name of all the females from map

      Set<Map.Entry<String,String>> entrySetView=  employeeMap.entrySet();

      for(Map.Entry<String,String>each:entrySetView){
          if(each.getValue().equals("Female")){
              System.out.println("female name " +each.getKey());
          }

      }
        //Task 2: update the Female to Queen and Male to King

        for(Map.Entry<String,String> each: employeeMap.entrySet()){
            if(each.getValue().equals("Female"))
                each.setValue("Queen");
            else
                each.setValue("King");
        }
        employeeMap.forEach((employee, gender) -> System.out.println("my try "+employee + " "+gender));

        System.out.println("employeeMap = " + employeeMap);

    }//end main
}
