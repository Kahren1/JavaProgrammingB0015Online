package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {
        //ArrayList internally uses an array
        //if you add one item to the list with the add()
        //it creates an array one length bigger, that copy all the old elements and add the new one at the end

        //LinkedList is internally backed by node
        //If you need to add one element
        //the element has a pointer to the previous(??) and next element
        //adding one element, new element will have a pointer pointed to it from the previous element
        //and has the address of the next element
        List<String> lst = new LinkedList<>();
        lst.add("Zeynep");
        lst.add("Ershat");
        lst.add("Kamira");
        lst.add("Sabira");
        System.out.println("lst "+lst);


        System.out.println(lst.remove("Ershat"));
        System.out.println(lst.remove("notAName"));
        System.out.println(lst);

        //LinkedList vs ArrayList
        //getting random item by index
        //ArrayList is better (faster)

        //adding removing items
       // LinkedList is better
        //the creator of the LinkedList does not remember the last time he used the LinkedList

        //Big O Notation (pronounced oh)
        //this is a way programmers describe the performance of an algorithm
        //the performance of an algorithm
        //the efficiency of operations
        //O(1) means the more elements you have on the list,
        //it does not change the performance
        //O(N) means it takes longer
    }
}
