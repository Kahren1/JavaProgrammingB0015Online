package day19;

import java.util.Scanner;

public class WarmUp_SpeedUpOrSlowDown_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start and end speed: ");
        int start = scan.nextInt();
        int end =scan.nextInt();
        int speed = start;
        if (start < end) {
            System.out.println("Increasing speed");
            for (; speed < end; speed++) {
                System.out.println("current speed is " + speed);
            }
        } else if(start==end) {
            System.out.println("Do nothing!");
        } else {
            System.out.println("Decreasing speed");
            for (; speed +1 > end; speed--) {
                System.out.print(speed + ", ");
            }
            System.out.println(speed +".");
        }
    }
}
