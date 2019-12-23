package day14;

public class PasswordValidator {
    public static void main(String[] args) {
        //PASSWORD VALIDATOR
        //min 8 char max 16 char
        //Must not contain space
        //must start with Ab

        String password = "Ab$password";
        String validationResult ="";
        if (password.length()>= 8 && password.length() <= 16) {
            if (password.contains("_")||password.contains("$")) {
                if (!password.contains(" ")) {
                    if (password.startsWith("Ab")) {
                        validationResult = "valid";
                    }else{
                        validationResult = "invalid";
                    }
                }else{
                    validationResult = "invalid";
                }
            }else{
                validationResult = "invalid";
            }
        }else {
            validationResult = "invalid";
        }
        System.out.println("password is: " +validationResult);

    }
}
