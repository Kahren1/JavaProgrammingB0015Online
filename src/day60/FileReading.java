package day60;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileReading {
    //1.create a text file in day60 package --> creat new file (not class)
    //enter a few lines of text
    //close the file (should save autmatically)
    //copy path

    public static void main(String[] args) throws IOException {
        // reading a file is one line of code - see below
        //it returns List of Strings, each line as element
try {
    List<String> allLines = Files.readAllLines(Paths.get("src/day60/note.txt"));
            //"C:\\Users\\Kahren\\IdeaProjects\\JavaProgrammingB0015Online\\src\\day60\\note.txt"));
    System.out.println("allLines = " + allLines);
    //printing each line separately
    for (String each : allLines) {
        System.out.println(each);
    }
}catch(Exception e){
    System.out.println("Boom!");
    System.out.println(e.getMessage());
}

    }
}
