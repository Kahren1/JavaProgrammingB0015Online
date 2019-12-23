package day16;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {
        String name = "I love Java I love Java Java Java";

        System.out.println("Java starting from 0: "+ name.indexOf("Java"));
        System.out.println("Java starting from 7: "+name.indexOf("Java", 7));
        System.out.println("Java starting from 9: " + name.indexOf("Java", 9));
        System.out.println("Java starting from 19: "+ name.indexOf("Java", 19));
        System.out.println("Java starting from 20: " +name.indexOf("Java", 20));
        
        //how to start from the location that gets past first Java
        int firstJavaLocation = name.indexOf("Java"); //index of first java
        
        int startingPointToSearchSecondJava = firstJavaLocation +1;
        int secondJavaLocation = name.indexOf("Java", startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);
        System.out.println();
        //3+ words, what is the second word
        int firstSpaceLocation = name.indexOf(" ");
        System.out.println("firstSpaceLocation = " + firstSpaceLocation);
        int secondSpaceLocation = name.indexOf(" ", firstSpaceLocation+1);
        System.out.println("secondSpaceLocation = " + secondSpaceLocation);


    }
}
