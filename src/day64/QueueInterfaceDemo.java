package day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {
        //it's a LinkedList, so it takes duplicates
        //LinkedList is the implementation of both the List and the Deque!!!! so it has two features
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("review the previous class");
        taskQueue.add("do your homework");
        taskQueue.add("Say bye to Java");
        taskQueue.add("Say bye to Java");
        taskQueue.add("Say bye to Java");
        taskQueue.add("Say bye to Java");

        System.out.println("taskQueue = " + taskQueue);
        //the idea of FIFO can be seen when you remove the item
        //the order is kept here because we have a LinkedList implementation
        //retrieves and removes the head of the Queue
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());


    }
}
