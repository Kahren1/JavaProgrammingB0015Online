package day27;

import java.util.Arrays;

public class MultiDArrays_3D {
    //N dimensional array must contain (N-1) dimensional arrays

    public static void main(String[] args) {
        //2D array contains 1D array

        int[][] arr2D = { {1,2,3}, {4,5,6} };

        //3D array: contains 2D array
        int[][][] arr3d = { { {1,2,3}, {4,5,6} } , { {7,8,9},{10,11,12}}   };

        //print 9
        System.out.println(arr3d[1][0][2]);

        //print {1,2,3} - need to use Arrays.toString(arr) method
        System.out.println(Arrays.toString(arr3d[0][0]));

        //print { {7,8,9}, {10,11,12} } - need to use Arrays.deepToString(arr) method
        System.out.println(Arrays.deepToString(arr3d[1]));

        //looping through each element of the array
        for (int i = 0; i < arr3d.length; i++) {
            for (int j = 0; j < arr3d[i].length; j++) {
                for (int k = 0; k < arr3d[i][j].length; k++) {
                    System.out.print(arr3d[i][j][k] +" ");
                }
            }
        }


    }
}
