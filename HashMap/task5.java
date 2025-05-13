// Priority Queue

import java.util.*;
public class task5 {
    public static void main(String[] args) {
        // declare Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int[] ranks = {22 , 25 , 3 , 11 , 88 , 96} ;
         

        for(int i = 0 ; i < ranks.length ; i++){
            pq.add(ranks[i]) ;
        }
        System.out.println(pq);

        //System.out.println(pq.peek());

        while(pq.size() > 0){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
