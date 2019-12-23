package day12;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "uuu";
        String password = "";
        String correctUserName = "user123";
        String correctPassword = "pass123";

        boolean isUserNameCorrect = userName.equals(correctUserName);
        boolean isPasswordCorrect = password.equals(correctPassword);
        if (isUserNameCorrect && isPasswordCorrect)
            System.out.println("Login successful");
        else if (!isUserNameCorrect && !isPasswordCorrect)
            System.out.println("Both inputs incorrect");
        else if (!isUserNameCorrect)
            System.out.println("Username is incorrect.");
        else if (!isPasswordCorrect)
            System.out.println("Password is incorrect.");

    }
}
