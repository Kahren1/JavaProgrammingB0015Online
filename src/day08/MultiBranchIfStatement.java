package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //Plain English pseudocode
        /*
        given the currentSpeed, speedLimit
        >70,---> point taken
        >60, <70 ---> warning

        if not speeding --> keep driving
         */
        int currentSpeed = 65;

        if (currentSpeed>70){
            System.out.println("point taken");
            //&& is a for boolean expressions
        }else if(currentSpeed>60&&currentSpeed<=70) {
            System.out.println("Your speed is more than 60, not more than 70");
        }else{
            System.out.println("Keep driving, you are good");
        }




    }
}
