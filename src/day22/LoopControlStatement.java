package day22;

public class LoopControlStatement {
    public static void main(String[] args) {

        String str = "I struggle  with Java I like Java I love Java Everything is awesome";
        // loop thourgh each letter, print every other letter

        str = str.replace(" ", "");

        System.out.print(str + "\n");

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(str.charAt(i) + " ");

            if (str.substring(i, i + 1).equals("a")) {
                break;
            }
        }
    }
}
