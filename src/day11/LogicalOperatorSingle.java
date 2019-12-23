package day11;

import org.w3c.dom.ls.LSOutput;

public class LogicalOperatorSingle {

    //isEngineRunning, isCommunicationSystemWorking, isAirEnough

    // & ---> both operands are evaluated
    public static void main(String[] args) {


        boolean isTrue = 5 > 10;

        System.out.println(isTrue&&9 / 0 == 3);
        //System.out.println(isTrue& 9 / 0 == 3);

        //logigal NOT operator ! negates the boolean value
        System.out.println("result of !true is " +!true);

    }
}
