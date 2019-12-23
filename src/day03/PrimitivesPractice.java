package day03;

public class PrimitivesPractice {
    public static void main(String[] args) {
        byte letterCount = 26;
        System.out.println("The letter count is: "+ letterCount);
        short sheepCount = 300;
        int catCount = 20;
        long mileToSun = 100_000_000;
        float priceOfBanana = 19.9f; //you must end f or F at the end of the float data type
        float priceOfPotato = 2.49f;

        // ---largest floating point - ingest large fluffy dogs
        double priceOfIpad = 355.99d; //doubles must end with d
        //if it's just a whole number, compiler treats at as an int
        // If it's a fractional number, compiler assumes it is a double, d is not required but a good programming practice

        System.out.println("Sheep Count is: "+ " "+
                sheepCount + " " +
                catCount +" "+
                mileToSun +" "+
                priceOfBanana + " "+
                priceOfIpad + " "+
                priceOfPotato);

    }
}
