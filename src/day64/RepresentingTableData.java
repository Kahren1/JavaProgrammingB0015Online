package day64;

import java.util.*;

public class RepresentingTableData {
    //List of Map Practice for Table Data
    public static void main(String[] args) {
        //for single row
        //I want to get the value by its column name
        //so I choose Map k-v columnName, valuefromCellOnCertainRow
//row
        Map<String, String> row1 = new LinkedHashMap<>();
        row1.put("first name", "Regan");
        row1.put("email", "cat@google.com");
        row1.put("gender", "Female");

        //for one row I used one map
        //but I have many rows
        //rows may be of some type -> List<SomeType>
        Map<String, String> row2 = new LinkedHashMap<>();
        row2.put("first name", "Zhenya");
        row2.put("email", "Zhenya@google.com");
        row2.put("gender", "Male");

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        //for one row I used one map
        //but I have many rows
        //rows may be of some type -> List<SomeType>
        List<Map<String, String>> rowMapLst = new ArrayList<>();
        rowMapLst.add(row1);
        rowMapLst.add(row2);

        System.out.println("rowMapLst = " + rowMapLst);


        System.out.println("rowMapLst.get(1).get(\"email\") = " + rowMapLst.get(1).get("email"));
        System.out.println("making change to reflect on github");
        //update the name of 1st row to Hulk
        System.out.println("rowMapLst.get(0).replace(\"first name\", \"Hulk\") = " +
                rowMapLst.get(0).replace("first name", "Hulk"));
        System.out.println("rowMapLst = " + rowMapLst);
    }
}
