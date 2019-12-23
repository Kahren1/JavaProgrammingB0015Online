package day31;

public class MethodIntro {
    public static void main(String[] args) {
        //two ways to call static methods
        //ClassName.methodName (external data if needed)
        //if in the same class you can directly call
        //by methodName
        MethodIntro.sayHello();
        sayHello();
    }
//Do not create a method inside the main method
    public static void sayHello(){
        System.out.println("Hello world");
        System.out.println("My name is Juma");
        System.out.println("I love Java");
    }

}
