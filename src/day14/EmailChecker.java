package day14;

public class EmailChecker {
    public static void main(String[] args) {
        String email = "gosha@mail.ru";
        if (email.contains(" ") || !email.contains("@")) {
            System.out.println("invalid email");
        }else{
            if (email.endsWith("@gmail.com")) {
                System.out.println("gmail");
            } else if (email.endsWith("@yahoo.com")) {
                System.out.println("yahoo");
            } else if (email.endsWith("@mail.ru")){
                System.out.println("Russian mail.ru");
            }
        }
    }
}


