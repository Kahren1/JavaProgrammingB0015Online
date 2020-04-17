package day33;

public class NumberActions {
    public static void main(String[] args) {
        int finalAddend = 20;
System.out.println(adding(finalAddend));
 finalAddend = -10;
        System.out.println(adding(finalAddend));

    }
    /**
     * getSumFrom1toX
     * this methdd will calculate the sum from 1 to the number user passed
     * @param x final addend
     */

    public static int adding(int x){
        int sum =0;
        if (1<x){
            for(int i=1; i<=x;i++){
                sum+=i;
            }
        }if (1>x){
            for (int j = 1; j >=x ; j--) {
                sum+=j;
            }
        }
      return sum;
    }

}
