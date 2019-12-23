package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {
    public static void main(String[] args) {
        //N-dimensional array Must contain (N-1) dimensional arrays

        //2 dimensional array Must contain (2-1) dimensional arrays

        String[][] names = {{"Rukhshona", "Ghoya"}, {"Hasan", "Tetiana"}};

        //print hasan
        System.out.println(names[1][0]);

        //print Tetiana
        System.out.println(names[1][1]);

        //assign Dilshat to..
        names[1][1] = "Dilshat";

        //print Hason and Dilshat
        System.out.println(Arrays.toString(names[1]));

        //print all
        System.out.println(Arrays.deepToString(names));

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
//printing out elements individually, separated by comma
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");


            }
            System.out.println();
        }
        // task = int 2D array print out all even numbers


        int[][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 23}};
        //print out all even numbers separated by " ";
        for (int[] elem : ages) {
            for (int elem1 : elem) {
//                if(elem1%2==0){
//                    System.out.print(elem1 +" ");
//                }
                if (elem1 % 2 != 0) {
                    continue;
                }
                System.out.print(elem1 + " ");

            }
        }
    }
}
