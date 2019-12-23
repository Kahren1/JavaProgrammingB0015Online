package day14;

public class TrimAndIsEmpy {
    public static void main(String[] args) {
        String message = "   REPL is coming! ";
        System.out.println("message character count is "+ message.length());
        System.out.println(message.trim());
        System.out.println(message.trim().length());
        System.out.println(message.isEmpty());
    }
}
