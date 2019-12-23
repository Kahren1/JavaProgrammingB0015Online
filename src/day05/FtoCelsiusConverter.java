package day05;

import java.util.Scanner;

public class FtoCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("temp in F, pls.");
       double tempFahrenheit = scanner.nextDouble();
       double tempCelsius = (tempFahrenheit - 32.0)/1.8;
        System.out.println("Temp in C is: " + tempCelsius);

    }
}
