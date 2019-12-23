package day09;

public class LanguagePicker_w_SwitchStatement {
    public static void main(String[] args) {
        int languageIntNumber = 2;
        String greeting = "";
        switch(languageIntNumber){
        case 1:
            greeting = "Hello, SDET";
            break;
            case 2:
            greeting = "Salaam";
            break;
            case 3:
            greeting = "Hola, SDET";
            break;
            case 4:
            greeting = "Привет тестировщикам";
            break;
            default:
            greeting = "Language unknown";
        }
        System.out.println(greeting);
    }
}
