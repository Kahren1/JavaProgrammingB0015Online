package day26;

import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args) {
        //int [] myArray = new int{ 10, 40, 30, 7 };
        //third way - must happen in one statement
        int [] myArray = { 10, 40, 30, 7 };

        //make 3rd elem the sum of 1 and 2 elems
        myArray[2] = myArray [0] + myArray [1];
//swap the first item value with the last item value
        int myArr0holder = myArray[0];
        myArray[0]=myArray[myArray.length -1];
        myArray[3]=myArr0holder;
        System.out.println(Arrays.toString(myArray));

    }
}
