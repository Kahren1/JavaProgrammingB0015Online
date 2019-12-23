package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
        //given a String w even number char count
        //print 2 characters in one like, e.g.
        //Ayra
        /*
        Ay
        yr
        ra
         */
        String str ="Donald";
        for(int i=0;i<str.length();i++){
            System.out.println(str.substring(i, i + 2) );
        }
    }
}
