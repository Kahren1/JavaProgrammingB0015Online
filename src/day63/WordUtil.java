package day63;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {
    public static void main(String[] args) {
        String str="Fun Fun Fun Java ends tomorrow No Fun never ends";

        String [] allWords = str.split(" ");
       System.out.println(allWords.length);
       //we want to solve it using Map because Map only has uniques keys to use for unique words
        //create a Map object HashMap implementation
        //Loop through the word array
        //check if we if the Map already containsKey
        //if not, enter for the first time with count one
        //else replace the value (count) by getting the old one +1
       Map<String, Integer> wordFreq = new HashMap<>();
       for(int i=0; i<allWords.length;i++){
           if(!wordFreq.containsKey(allWords[i])){
               wordFreq.put(allWords[i],1);
           }else {
               wordFreq.replace(allWords[i], wordFreq.get(allWords[i]) + 1);
           }
       }
       System.out.println(wordFreq);

      Map <String, Integer> wordCountMap= getWordFrequency("Fun Fun Fun Fun Eye");
        System.out.println("wordCountMap = " + wordCountMap);


    }//end main

    //create a method that accepts a string and generates a frequency map
   public static Map getWordFrequency(String str){
        String [] allWords;
       allWords = str.split(" ");

       Map<String, Integer> wordFreq = new HashMap<>();
       for(int i=0; i<allWords.length;i++){
           if(!wordFreq.containsKey(allWords[i])){
               wordFreq.put(allWords[i],1);
           }else {
               wordFreq.replace(allWords[i], wordFreq.get(allWords[i]) + 1);
           }
       }
       return wordFreq;
   }
}
