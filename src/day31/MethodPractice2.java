package day31;

public class MethodPractice2 {
    public static void main(String[] args) {
        countOneToTen();
        printOddNumbers();
        spellName("Kahren Mkrtchyan");
        twentyToOne();

    }

    public static void countOneToTen() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println("");
    }
    public static void printOddNumbers(){
        for (int i = 1; i < 100 ; i+=2) {
            System.out.print(i +" ");
        }
    }
    public static void spellName(String name) {
        System.out.print("\n" + name.charAt(0));
        for (int i = 1; i < name.length(); i++) {
            System.out.print("-" + name.charAt(i));
        }
    }
    public static void twentyToOne(){
            System.out.println("");
            for (int i = 20; i >0 ; i--) {
                System.out.print(i +" ");
            }
    }


}
