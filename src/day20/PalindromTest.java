package day20;

public class PalindromTest {
    //given a String str w value, reverse the str
    //store reversed value into another String str
    public static void main(String[] args) {

        String name ="A roza upala na lapu Azora";
        String nameWoutSpaces=name.replace(" ","");
        String reverseName ="";

        for(int i=nameWoutSpaces.length()-1;i>=0;i--){
            reverseName+=nameWoutSpaces.charAt(i);
        }
        if(nameWoutSpaces.equalsIgnoreCase(reverseName))
            System.out.println("Palindrome!");
        else
            System.out.println("not a palindrome");

        System.out.println("name = " + name);
        System.out.println("reverseName = " + reverseName);
    }
}
