package day59;

public class ExceptionPractice {
    /**
     * scan.nextInt() --> expect number
     *             if we pass String ---> exception at runtime
     * String str = "a";
     * str.charAt(100) --> exception at run time
     *
     * String str2 = null
     * str2.charAt(0) --> exception at run time
     *
     * int[] arr = {1,2,4};
     * print(arr[100] ) --->exception at run time
     *
     *
     * Shape a1 = new Circle();
     * Rectangle r1= (Rectangle)a1; //compile-fine - code compiles, Throw ClassCastException at run time
     *
      */

    //What about compiler Error?
    //these are syntax errors which do not let your code compile

    //the process of dealing with the "unexpected" event is called Exception Handling (aka contingency planning).

    //Exceptions are objects!
    //Exceptions in Java are categorized using Exception Hierarchy Heir-AR-kee
    //All different types of exceptions have their own classes
    //to be the blueprints for the exceptions objects created at runtime
    //Throwable is the super class type of ALL of the Exception classes

    //Exceptions: try to RECOVER from it
   // OR report it
    //OR diagnose it / debug



}


