package replPractice;

import java.util.Scanner;

public class Repl93 {
    public static void main(String[] args) {
            boolean exists = false;
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            if (word.startsWith("java") || word.startsWith("java", 1))
                exists = true;



            System.out.println(exists);
        }
    }
