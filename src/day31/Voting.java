package day31;

public class Voting {
    public static void main(String[] args) {
        int age = 15;
        determineElegibilty(age);
        age = 20;
        determineElegibilty(age);
    }
// this method accepts one int parameter
    //the method parameter is only accessible inside the method (scope)
    public static void determineElegibilty (int age){
        if(age>=18){
            System.out.println("Age intered: "+age + " Eligible!");
        }else{
            System.out.println("Age intered: " +age + " Keep growing");
        }
    }

}
