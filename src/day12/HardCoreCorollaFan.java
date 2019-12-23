package day12;

public class HardCoreCorollaFan {
    public static void main(String[] args) {
        /* more action

         */
        String carBrand ="corolla";
        int carPrice = 60_000;
        int budget = 60_000;
        //best code is self-commenting code
        if(carBrand.equals("corolla"))
            System.out.println("Buy Corolla");
        else if(carBrand.equals("Tesla")&&carPrice<=budget)
            System.out.println("Buy Tesla");
        else
            System.out.println("Not what I am looking for");
    }
}
