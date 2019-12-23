package day31;

public class Greeting {
    public static void main(String[] args) {
        //method caller
        sayHello();
        //method caller
        sayHello("Zhibek");
    }

public static void sayHello(){
    System.out.println("Hello ");
}
//method parameter tells that when this method is called, it expects this type of data when it is called
public static void sayHello(String name){
    System.out.println("Hello, " + name);
}
}