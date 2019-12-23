package day08;

public class IfElseStatement {
    public static void main(String[] args) {

        int speedLimit = 60;
        int yourCurrentSpeed = 100;

        //if yourCurrentSpeed is more than the speed limit
        //get pulled over by the police
        //get ticket from the police
        //have points taken from your driving record
        //go to court

        //if not over the limit
        //go shopping!

        //outside the statement, say the end

        boolean isSpeeding = (yourCurrentSpeed>speedLimit);

        if(isSpeeding){
            System.out.println("get pulled over by the police," +
                    " given ticket by the policee" +
                    " take away some points" +
                    " go to court");
        }else{
            System.out.println("go shopping" +
                    " buy iceCream" +
                    " Enjoy your day");
        }
        System.out.println("the end");


    }
}
