package day11;

public class StringEquality {
    public static void main(String[] args) {
        char c1 = 'b';
        char c2 = 'B';
        char c3 = 'b';

        System.out.println("is c1 equal to c3 " +  (c1==c3));

        String name = "Rabia";
        String name2 = new String("Rabia");
        String name3 = "Rabia";

        System.out.println(name + " "+name2);
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
        System.out.println(name==name3);
    }
}
