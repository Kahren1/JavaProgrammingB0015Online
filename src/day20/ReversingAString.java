package day20;

public class ReversingAString {
    //given a String str w value, reverse the str
    //store reversed value into another String str
    public static void main(String[] args) {

        String name ="John Snow";
        String reverseName ="";

        for(int i=name.length()-1;i>=0;i--){
            reverseName+=name.charAt(i);
        }
        System.out.println("name = " + name);
        System.out.println("reverseName = " + reverseName);
    }
}
