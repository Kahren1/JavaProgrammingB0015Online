package day11;

public class MoreOrLess {

    public static void main(String[] args) {
        int num = 55;
        boolean isMoreOrLess = num > 100 || num < 10;

        boolean isWithinTheRange = num > 10 && num < 60;

        System.out.println(num + ": is the number  >100 or <10? " + isMoreOrLess);
        System.out.println(num + ": is the number >10 and <60? " + isWithinTheRange);

    }
}
