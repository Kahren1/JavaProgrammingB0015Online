package day27;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        //2D array = contains single dimensional arrays
        //[index num of 1D arrays][index num of elements]
        int [][] arr2D ={ {1,2,3}, {4,5,6} };
        //arr2D[0] ===>{1,2,3}

        //Arrays.toString is only applicable to one dimensional arrays

        //Arrays.deepToString(multi-D Arrays);

        System.out.println(Arrays.deepToString(arr2D) );
    }
}
