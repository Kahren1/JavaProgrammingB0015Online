package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\Kahren\\IdeaProjects\\JavaProgrammingB0015Online\\src\\day63\\employeeData.txt"));

        //   allLines.forEach(each->System.out.println(each));
//           for(String each:allLines){
//               System.out.println("each = " + each);
//           }

            Map<Integer,String> idNamePair = new HashMap<>();
            for(String each:allLines){
                idNamePair.put(Integer.valueOf(each.split(",")[0]),  each.split(",")[1]);
            }
            //getting a employee's name under #20
            System.out.println("idNamePair.get(20) = " + idNamePair.get(20));


        }catch(IOException e){
            System.out.println("Error!");

            }
    }
}
