package day11;

public class LogicalOperators {
    /*
    true&&true = true
    true&&false = false
    true||false = true
     */
    public static void main(String[] args) {
//        System.out.println("Truth table");
//        System.out.println((true&&true) + " the result of true&&true");
//        System.out.println((false&&true) + " the result of false&&true");
//        System.out.println((false&&false) + " the result of false&&false");
//
//        System.out.println("");
//        System.out.println((true||true) + " the result of true OR true");
//        System.out.println((false||true) + " the result of false OR true");
//        System.out.println((false ||false) + " the result of false OR false");

        int x =55;
       boolean isTrue= (x>50)&&(x!=52)||(x==57);
       //true&&true||false = true
        System.out.println(isTrue);
    }
}
