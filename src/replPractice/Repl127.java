package replPractice;

import java.util.*;

public class Repl127 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int count = 0;
        System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
        for (int j = 0; j < inhabitants.length; j++) {
            while (inhabitants[j] != 0) {
                for (int k = j; k < inhabitants.length; k++) {
                    inhabitants[k] /= 2;
                }
                System.out.println("Day " + ++count + " " + Arrays.toString(inhabitants));
            }

        }
        System.out.println("---- EXTINCT ----");
    }
}
