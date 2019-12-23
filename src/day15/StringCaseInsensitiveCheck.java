package day15;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {
        String name = "Arya Stark";
        System.out.println( "does name contain \"st\"? " + name.contains("st"));

        //want to check if this name contains st no matter the case
        //store either the uppercase or lowercase version of the name, than compare
        //one option:
        String upperCaseName = name.toUpperCase();
        System.out.println("uppercase name contains ST? " +upperCaseName.contains("ST"));

        //now method chaining = combining multiple method calls

        System.out.println(name.toLowerCase().contains("st"));


    }
}
