package day20;

public class WorkingWMoreThanOneCharInString {
    public static void main(String[] args) {
        String str= "Gokyuzum";
        for (int i = 0; i < str.length(); i+=2) {
            System.out.println(str.substring(i,i+2));
        }
    }
}


