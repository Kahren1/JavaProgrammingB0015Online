package day21;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {
        String myName = "May name is Kahren";
        int counter = 1;

        for (int i = 0; i < myName.length()-1; i++) {
            //System.out.print(myName.charAt(i)+ "->");

            // System.out.print(myName.substring(i,i+1)+ "->");
            System.out.print(myName.substring(i, i + 2)+ " ");
        }
//find out word an, case insensitive
            for (int j = 0; j < myName.length()-1; j++) {
                if (myName.substring(j, j+2).equalsIgnoreCase("en")){
                    System.out.println( counter + " occurence of index of an: " + j);
                    counter++;
                }

            }



    }
}
