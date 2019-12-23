package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        //indexOf --> returns the index of another String within a String

        String name = "Game of Java";
        System.out.println(name.length());

        //find out the location of java
        //find out the location of letter o
        //find out the location of first space

        System.out.println(name.indexOf("Java") +" index of Java");
        System.out.println(name.indexOf("o") + " index of o");
        System.out.println("find the location of uppercase \"O\": " + name.indexOf("O"));

    }
}
