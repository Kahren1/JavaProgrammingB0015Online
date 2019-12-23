package day12;

public class CarShopping {
    public static void main(String[] args) {
        //buy Corolla or Tesla (only if fits the budget)

        String carBrand = "corolla";
        int budget = 40_000;
        int askingCarPrice = 30_000;
        if(carBrand.equals("corolla")||(carBrand.equals("Tesla")&&askingCarPrice<=budget ))
        System.out.println("Buy now");

    }
}
