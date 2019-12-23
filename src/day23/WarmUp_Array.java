package day23;

public class WarmUp_Array {
    //3 ways to create arrays
    //int[] arr = new int[3]; arr[0] = 1; arr[2] = 3;
    //int[] arr= {2,3,4};
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
//first way to create an array object and add value into index locations;
        int[] arr1 = new int[7];
        arr1[0] = 0;
        arr1[1] =111;
        arr1[2]= 222;
        arr1[3] = 777;
        arr1[4] = 444;
        arr1[5] = 555;
        arr1[6] = 20;
        int lastItem = arr1[arr1.length - 1];
        System.out.println(lastItem);

        int middleItem = arr1[arr1.length/2];
        System.out.println(middleItem);
        
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("sum = " + sum);

//second way to create an array
        //int[]num2 = new int[]{0,1,2,3,4,5,6};

        //third and the shortest way
        //must happen in one line, can't declare first and assign later
        //int[]num3 = {1,2,3,4,5}
    }
}
