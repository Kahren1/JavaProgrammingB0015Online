package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        double[] prices = {11.11, 22.22, 33.33, 44.44, 55.55};

        //for each loop syntax
        //for (dataTypeOfYourArray variableNameforEachItem : yourArrayVariable){
     // }
//for each loop can only be used for Collection type
        //there is no infinite loop ever in for each loop
        for(double price : prices){
            System.out.println("price = " + price);
        }
    }
}
