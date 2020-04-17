package day64;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Deque_for_LIFO {
    //in early Java there was a class called Stack
    //How do we implement a LIFOQueue wo using the old class called Stack?
    //we can use any of Deque interface implementation
    //Deque is a double ended Queue so we can add items as always
    //and when we remove we can use removeLast() method to achieve LIFO
    public static void main(String[] args) {
        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review the previous class");
        lifoQue.add("do your homework");
        lifoQue.add("Say bye to Java");
        lifoQue.add("Say bye to Java");
        lifoQue.add("Say bye to Java");
        System.out.println("Hi!");
        
        System.out.println("lifoQueue = " + lifoQue);

        System.out.println("lifoQueue.remove() = " + lifoQue.remove());
        System.out.println("lifoQueue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQueue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQueue.removeLast() = " + lifoQue.removeLast());




    }
}
