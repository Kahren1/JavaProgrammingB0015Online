package day18;

public class DoWhileIntro {
    public static void main(String[] args) {
        //count from 1 to 5
        //do {
       // take some action here and repeat
   // }while (condition is true)

        //   || double pipe
        //  & Ampersand


        int x=1;
        do{
            System.out.println(x);
            ++x;
        }while(x<5);
        System.out.println("we break out with x being equal to " + x);

        System.out.println(" ------------------------------------- ");
        int y=5;
        do{
            System.out.println("y = " + y);;
            System.out.println("counter: "+ --y);

        }while(y>=0);

    }
}
