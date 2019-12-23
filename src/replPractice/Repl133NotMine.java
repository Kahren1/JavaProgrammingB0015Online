package replPractice;

import java.util.*;

public class Repl133NotMine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];
        int i=0;
        int x=256;
        int y=128;
        for (int converter:binary){
            binary[i]=decimal%x/y;
            x/=2;
            y/=2;
            i++;
        }
        System.out.println(Arrays.toString(binary));
    }
}
