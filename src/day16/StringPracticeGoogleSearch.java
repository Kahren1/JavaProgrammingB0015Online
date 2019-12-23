package day16;

import javax.swing.*;

public class StringPracticeGoogleSearch {
    public static void main(String[] args) {
        //prompt for a String of any length
        //another String searchKeyword to store user input
        //assign tabTitle value = searchKeyword +"=Google Search"
        //check if tabTitle starts with your search keyword
        //if true = test passed, else = test has failed

        String keywordToSearch = "Java";
        String tabTitle = keywordToSearch +"- Google Search";
        if((tabTitle.startsWith(keywordToSearch))&&tabTitle.endsWith("- Google Search"))
        System.out.println("Test Passed");
        else
            System.out.println("Test failed");
    }
}
