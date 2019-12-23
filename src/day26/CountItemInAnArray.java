package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {

        int countOfBlack = 0;
        String [] marvelHeroes = {"Iron man", "Captain America", "Spiderman",
       "Black Panther", "Hulk", "Black widow", "Wanda", "Captain Marvel",
        "Captain America", "Spiderman",
        "Black Widow", "Wanda", "Captain Marvel",
        "Captain America"};
        System.out.println("Marvel Heroes = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToMatch = "Iron man";
        int countOfItem=0;
        for(String hero :marvelHeroes){
            if(hero.equals(itemToMatch)){
                countOfItem++;
            }

        }
        System.out.println("Array length: " + countOfItem);
        for(String hero:marvelHeroes){
            if(hero.toLowerCase().contains("black")){
                countOfBlack++;
            }
        }
        System.out.println("Count of black: " + countOfBlack);
    }

}
