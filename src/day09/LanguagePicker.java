package day09;

public class LanguagePicker {
    /*
    assume you are on the call and you have the option to be greeted by the language of your choice
    acccording to the provided number
     */
    public static void main(String[] args) {


        int languageIntNumber = 2;
        String greeting = "";
        if (languageIntNumber == 1) {
            greeting = "Hello, SDET";
        } else if (languageIntNumber == 2) {
            greeting = "Salaam";
        } else if (languageIntNumber == 3) {
            greeting = "Hola, SDET";
        } else if (languageIntNumber == 4) {
            greeting = "Привет тестировщикам";
        } else{
            greeting = "Language unknown";
        }
        System.out.println(greeting);
    }
}
