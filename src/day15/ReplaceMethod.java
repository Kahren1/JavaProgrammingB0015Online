package day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        String message = "I love Pumpkin, Pumpkin is FUN!";
        message = message.replace("Pumpkin", "Java");
        System.out.println(message);

        String message2 = "Happy Thanks giving to All";
        //replace
        message2 = message2.replace("Thanks ", "Thanks");
        System.out.println(message2);

        String message3 = "tomorrow is off no!";
        System.out.println(message3.replace(" no", ""));
    }
}
