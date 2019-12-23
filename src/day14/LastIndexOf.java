package day14;

public class LastIndexOf {
    public static void main(String[] args) {
        String name = "Game of Java";

        //index of location of the letter showing up the last time
        //index of "Ga" shows up the last time
        //index of "Kawa" shows up the last time

        System.out.println("index of location of the letter showing up the last time");
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("Ga"));
        System.out.println(name.lastIndexOf("Kawa"));
    }
}
