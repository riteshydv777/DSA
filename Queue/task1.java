// Print all the element present in given queue 
// only using add(),peek(),size() and extra queue

import java.util.*;
public class task1 {
    public static void main(String[] args) {
        // dclare queue
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        // create extra queue

        Queue<Integer> helper = new LinkedList<>();

        while(q.size() > 0){
            System.out.println(q.peek());
            helper.add(q.poll());
        }

        while(helper.size() > 0){
            q.add(helper.poll());
        }


    }
}
