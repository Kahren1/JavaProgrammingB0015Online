package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
        //break - the condition to stop the loop
        //continue =
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
            int j;
            for (j = 1; j < 10; j++) {

                if(sum+j>40){
                    break;
                }
                sum += j;
            }
            System.out.println("final sum  = " + sum);

        }
        //while iterating 1-10, break out at
}
