package day57_exception2;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Checked exception in next line");
        // unhandled exception: java.lang.InterruptedException
        //checked exceptions need to be 1)handled or 2) declared fot the code to compile
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println("After Thread.sleep");
        }
    }
}
