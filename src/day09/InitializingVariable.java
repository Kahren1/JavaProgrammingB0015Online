package day09;

public class InitializingVariable {
    public static void main(String[] args) {
        //a variable inside a method must get initial value
        //befor being used for the first time
        //there should not be a chance
        //that variable has no value before usage
        String name = "";
        System.out.println(name);
    }
}
