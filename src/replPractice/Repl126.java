package replPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Repl126 {

    public static void main(String[] args) {

        /*
        Write a program that will find out shortest words in the given string str. If there are few words
         that are evenly short, print them all.
         Use split method in order to split str string variable and create an array of strings.
         Print array with Arrays.toString() method. Sort array before printing.
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
input: olive, hot pursuit, warning, python, angle, coffee, beech, boost, trainer
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strArr = str.split(",");
        String temp;
        int shortWordCount = 0;
        System.out.println(Arrays.toString(strArr));


        //rearrange the words inside the array from min to max length
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].length() > strArr[j].length()) {
                    temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(strArr));

        //see how many same length shortest words are in the array
        int shortestLength = strArr[0].length();
        for(String a: strArr){
            if(a.length()==shortestLength){
                shortWordCount++;
            }
        }

        System.out.println(shortWordCount);

        //make a short word array with the determined length
        String[] shortWordArr = new String[shortWordCount];

        for (int l = 0; l <shortWordCount; l++) {
            shortWordArr[l] = strArr[l];
        }

        //sort and print
        Arrays.sort(shortWordArr);
        System.out.print(Arrays.toString(shortWordArr));


    }
}
