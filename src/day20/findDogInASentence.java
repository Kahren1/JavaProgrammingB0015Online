package day20;

public class findDogInASentence {
    public static void main(String[] args) {
        //find the location of the dog
        //doing 3 characters at a time
        //if 3 characters == dog, print out the index
        String msg = "I like Dog, Dogs are cute, Dogs are friendly";

        for (int x = 0; x <= msg.length() - 2; x++) {
            String current3char = msg.substring(x, x + 3);
            if (current3char.equalsIgnoreCase("dog")) {
                System.out.println("Bingo! at " + x);
            }

        }

    }
}
