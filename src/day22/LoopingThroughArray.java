package day22;

public class LoopingThroughArray {
    public static void main(String[] args) {


        int[] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

//getting the size of any array object
        //array object has a property called length - a property, no a method()
        int itemCount = scores.length;

        // going through an array in reverse
        for (int i = itemCount-1; i >=0 ; i--) {
            System.out.println(scores[i]);
        }
    }
}
