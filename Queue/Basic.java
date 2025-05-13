// Queue data structure
// Introduction

import java.util.*;
public class Basic{
    public static void main(String[] args) {
        // declare queue
        Queue<Integer> q = new LinkedList<>();

        q.add(2);
        q.add(5);
        q.add(8);

        // display
        System.out.println(q);

        // size of queue
        System.out.println(q.size());
        
        // peek()
        System.out.println(q.peek());

        // remove element
        System.out.println("after removing");
        q.remove();
        //q.poll();
        System.out.println(q);
        System.out.println(q.size());

        // isEmpty()
        System.out.println(q.isEmpty());
    }
}