package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {
        double[]prices = new double[5];
        System.out.println(prices [0]);

        System.out.println(prices);
        prices [0]=2.46;
        prices [1] = 12.96;
        prices [2] = 992.1;
        prices [3] = 500 ;
        prices [4] = 65.123;

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        char [] nameArray = new char [6];
        nameArray[0] = 'K';
        nameArray[1] = 'a';
        nameArray[2] = 'h';
        nameArray[3] = 'r';
        nameArray[4] = 'e';
        nameArray[5] = 'n';

        for (int j = 0; j < nameArray.length; j++) {
            System.out.print(nameArray[j] +" ");
        }

        boolean [] yesNo = new boolean [3];
        System.out.println(yesNo[0] +" " +yesNo[1] +" "+yesNo[2] );

String [] householdNames = new String [6];
householdNames[0] = "Kahren";
householdNames[1] = "Rimma";
householdNames [2] = "Nailya";
householdNames [3] = "Erik";
householdNames [4] = "Sonia";
householdNames [5] = "Amina";

        for (int i = 0; i < householdNames.length; i++) {
            System.out.println(householdNames[i]);

        }

    }
}
