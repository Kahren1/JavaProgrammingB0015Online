package day57_exception2;
import java.util.*;

public class OutofMemoryDemo {
    //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>();
        for(int i=1;i>0;i++){
            nums.add(i);
        }
    }
}
