package day12;

import org.w3c.dom.ls.LSOutput;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
/*If the month is less than 1 or more than 12 —>> INVALID MONTH
If the month is between 3-5  print it's  spring
If the month is between 6-8  print it's  summer
If the month is between 9-11  print it's  fall
If the month is 12,1,2  print it's  Winter!

 */

        int month = 10;

        if (month < 1 || month > 12)
            System.out.println("INVALID MONTH");
        if (month >= 3 && month <= 5)
            System.out.println("it's spring");
        if (month >= 6 && month <= 8)
            System.out.println("it's summer");
        if (month >= 9 && month <= 11)
            System.out.println("it's fall");
        if (month == 12 || month == 1 || month == 2)
            System.out.println("it's winter");
    }
}
