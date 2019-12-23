package day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String name = "Kahren";
        int count = 0;
        //.toCharArray comes from String
        char [] nameArr = name.toCharArray();

        for (char element : nameArr) {
            System.out.print(element + " ");
            //how many 'a's?
            if(element=='a'){
                ++count;
            }
        }
        Arrays.sort(nameArr);
        System.out.println(Arrays.toString(nameArr)  );
    }
}
