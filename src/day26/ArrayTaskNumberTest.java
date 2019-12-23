package day26;

public class ArrayTaskNumberTest {
    /*
    given an int array
    check if all elements in this array have a value >100
     */
    public static void main(String[] args) {
        int[] scores ={156,101, 187, 87, 110};

        boolean isLessThan100 = false;

        for(int scoreElem: scores){
            if (scoreElem<100){
                isLessThan100=true;
                break;
            }

        }
        System.out.println("Are there any elements less than 100? " + isLessThan100);
    }
}
