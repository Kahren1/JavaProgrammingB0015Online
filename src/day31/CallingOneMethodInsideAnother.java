package day31;


public class CallingOneMethodInsideAnother {
    public static void main(String[] args) {
        finallyAwake(); //calling finally awake method

    }
public static void finallyAwake(){
        wakeup();
        drinkCoffee();
    }
        public static void wakeup(){
            System.out.println("open eyes");
            System.out.println("get out of bed");
        }

        public static void drinkCoffee(){
            System.out.println("put a spoon of an instant coffee in a cup");
            System.out.println("add hot water");
            System.out.println("start drinking");
        }


}
