package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        String sentence = "I love Java";
        String lastWord;
        String longestWord = "";

        //split (by Something) is a method of String that splits string into multiple parts
        //do we need to provide extra data when calling the method?
        //yes, whot do we use for splitting
        //it return a String [] array, (and .toCharArray returns a char []

        String[] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));

        //finding the last word in a sentence
        lastWord = allWords[allWords.length-1];
        System.out.println("lastWord = " + lastWord);

        String sentence2 = "Everything is awesome";
        //splitting by e array
        String [] splitSentence = sentence2.split("e");
        System.out.println(Arrays.toString(splitSentence));

        for (String wordChunk: splitSentence ) {
            System.out.println("wordChunk = " + wordChunk);
            if(wordChunk.length()>longestWord.length()){
                longestWord = wordChunk;
            }
        }
        System.out.println("longestWord = " + longestWord);
    }
}
