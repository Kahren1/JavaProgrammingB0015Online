package replPractice;

import java.util.Scanner;

public class Repl100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str1 = str;
        int count = 0;
        String bakedItem = "bread";
        int startIndex = 0;
        int endIndex = 0;
        while (str1.contains("bread")) {
            str1 = str1.replaceFirst(bakedItem, "");
            count++;
        }
        if (count <2) {
            System.out.println("nothing");
        } else {
            startIndex = str.indexOf(bakedItem) + bakedItem.length();
            endIndex = str.lastIndexOf(bakedItem);

            System.out.println(str.substring(startIndex, endIndex));
        }
    }
}
