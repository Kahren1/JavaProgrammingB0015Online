package day24;

public class ShoppingWithArray {
    /*
    Create a String array of 6 items to store groceryItems
{"apple","banana","grape","strawberry","blueberry","kiwi"}
Create a float array of 6 float values to store prices
{ 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
assume that the order of grocery Items match the prices in same order.
     */
    public static void main(String[] args) {
//String[] groceryItems = new String[6];
        //String[] groceryItems = new String[]{"apple","banana","grape","strawberry","blueberry","kiwi"};
        String[] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};
        String lastGroceryItem = groceryItems[groceryItems.length-1];
        for(String groceryItem: groceryItems){
            System.out.println("groceryItem = " + groceryItem);
            //print arrow, but not after the last item
            if(!groceryItem.equals(lastGroceryItem)){
                System.out.println("--->");
            }
        }
        int itemCount = groceryItems.length;

        System.out.println("lastGroceryItem = " + lastGroceryItem);
    }
}
