package day22;

public class ArrayIntro {
    public static void main(String[] args) {

        /*
        syntax to create creating variable to store single item
         and assigning value:
        datatype variableName = value;
        syntax for creating variable to store multiple items
        and assigning values
        dataType [] variableName = new dataType[count of items]
         */
        int[] scores = new int[4];
        scores [0] = 95;
        scores [1] = 70;
        scores [2] = 88;
        scores [3] = 100;
        for (int i = 0; i < scores.length ; i++) {
            System.out.println(scores[i]);
        }
        scores[1] = 99;
        System.out.println(scores[1]);

        //array size can't be changed!
        //new array objects come with default values in each element

        int[] numbers = new int[3];
        System.out.println( numbers[0] );

        byte[] data = new byte[4];
        for (byte i = 0; i < data.length; i++) {
            data[i] = i;
            System.out.println(data[i]);
        }
        System.out.println(data[3] = 5);



    }
}
