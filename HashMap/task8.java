// Implement Median Priority Queue

import java.util.*;
public class task8 {
    public static class MedianPriorityQueue{
        // declare left pq
        PriorityQueue<Integer> left ;
        // declare right pq
        PriorityQueue<Integer> right ;
        // constructor
        public MedianPriorityQueue(){
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }

        // add() function
        public void add(int val){
            if(right.size() > 0 && val > right.peek()){
                right.add(val);
            }else{
                left.add(val);
            }

            if(left.size() - right.size() == 2) right.add(left.remove());
            else if(right.size() - left.size() == 2) left.add(right.remove()) ;
    
        }
        // remove() function
        public int remove(){
            if(this.size() == 0){
                System.out.println("Underflow");
                return -1 ;
            }else if(left.size() >= right.size()){
                return left.remove() ;
            }else{
                return right.remove() ;
            }


        }
        // peek() function
        public int peek(){
            if(this.size() == 0){
                System.out.println("Underflow");
                return -1 ;
            }else if(left.size() >= right.size()){
                return left.peek();
            }else{
                return right.peek() ;
            }

        }
        // size() function
        public int size(){
            return left.size() + right.size() ;
        }

    }
    public static void main(String[] args) {
        MedianPriorityQueue mp = new MedianPriorityQueue();
        // add()
        mp.add(10);
        mp.add(20);
        mp.add(30);
        mp.add(40);
        mp.add(50);
        mp.add(60);
        // peek()
        System.out.println(mp.peek());
        // remove()
        mp.remove();

        System.out.println(mp.peek());

        System.out.println(mp.size());

    }
}
