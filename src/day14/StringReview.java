package day14;

public class StringReview {
    public static void main(String[] args) {
        String str = "Pumpkin";
        System.out.println(str.equals("pumpkin")); //equals returns a boolean
        System.out.println("does it contain Pumpkin:");
        System.out.println(str.contains("Pumkin"));
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumkin = " + gotPumpkin);

        //startsWith endsWith
        //checks whether a String starts of ends with another String
        //returns a boolean

        boolean startedWithI = str.startsWith("I");  //this method takes a String
        System.out.println("startedWithI = " + startedWithI);

        boolean endswithPumpkin = str.endsWith("Pumpkin");

    }
    }
