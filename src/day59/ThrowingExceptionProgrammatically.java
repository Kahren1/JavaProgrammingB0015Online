package day59;

public class ThrowingExceptionProgrammatically {
    public static void main(String[] args) {
        NullPointerException e1 = new NullPointerException();
        NullPointerException e2 = new NullPointerException("Back to earth");
        System.out.println(e2.getMessage());
        //How do I programmatically throw exception myself?
        //use throw keyword followed by exception object (or the variable pointing to the exception object
        //Java just throws the exception object during the runtime
        throw e2; //throw is the keyword with a single purpose = throwing the exception to the runtime
        //any code after the throw is the UNREACHABLE code
        //throw keyword is used to throw exception programmatically


    }

}
