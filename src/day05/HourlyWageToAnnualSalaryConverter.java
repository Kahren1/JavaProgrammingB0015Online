package day05;

import java.util.Scanner;

public class HourlyWageToAnnualSalaryConverter {
    public static void main(String[] args) {
        System.out.println("Hourly wage please, as an int: ");
        Scanner scanner = new Scanner(System.in);
        int hourlyWage = scanner.nextInt();
        int annualSalary = hourlyWage*2080;
        System.out.println( "Whis " + hourlyWage + " dollars an hour the annual salary would be " + annualSalary);

    }
}
