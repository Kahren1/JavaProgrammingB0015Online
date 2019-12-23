package day16;

import java.util.Scanner;

public class SecondWordGetter {
    public static void main(String[] args) {
        // given a sentence with 3 words
        //get the second word
        Scanner scan = new Scanner(System.in);
        System.out.println("Gimme 3 words ");

        String sentence = scan.nextLine();

        String secondWord = sentence.substring(sentence.indexOf(" ") +1, sentence.lastIndexOf(" "));
        System.out.println("Second word is: "+secondWord);
//        secondWord =sentence.substring(0,sentence.indexOf("_"));
//        System.out.println(secondWord);
//soutv, then tab or enter
        //get first word
        String firstWord = sentence.substring(0,sentence.indexOf(" "));
        System.out.println("firstWord = " + firstWord);
        //get last word
        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);
        System.out.println("lastWord = " + lastWord);


    }
}
