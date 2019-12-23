package day12;

public class LoginTest_V2 {
    public static void main(String[] args) {
        String userName = "abc123";
        boolean isUserNameCorrect = userName.equals("ABC123");
        System.out.println(isUserNameCorrect);
        boolean isIgnoreCaseCorrect = userName.equalsIgnoreCase("ABC123");
        System.out.println(isIgnoreCaseCorrect);

    }
}
