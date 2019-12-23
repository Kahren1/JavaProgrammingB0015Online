package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        String citizenType;
        int age = 70;

        if (age>65){
            citizenType = "Senior";
        }else {
            citizenType = "Non-Senior";
        }
        System.out.println("the citizen age is: "+ age +" and she/he is a "+citizenType);

    }
}
