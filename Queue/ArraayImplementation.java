// Array implementation of Queue

import java.util.*;
public class ArraayImplementation {
    // create class 
    public static class queueA{
        private int f = -1 ;
        private int r = -1 ;
        int size = 0 ;
        // create array
        private int[] arr = new int[5];

        // ....add()....
        public void add(int val){
            if(r == arr.length-1){
                System.out.println("Queue is full : ");
                return ;
            }
            if(f == -1){
                f = r = 0 ;
                arr[0] = val ;
            }
            else{
                arr[++r] = val ;
            }
            size++ ;
        }

        // ...remove()...
        public int remove(){
            if(size == 0){
                System.out.println("queue is empty !");
                return -1 ;
            }
            f++ ;
            size-- ;
            return arr[f-1] ;
        }

        // ...peek()...
        public int peek(){
            if(size == 0){
                System.out.println("queue is empty !");
                return -1 ;

            }
            return arr[f] ;
        }

        // ...isEmpty()....
        public boolean isEmpty(){
            if(size == 0) return true ;
            else return false ;
        }

        // ...display()...
        public void display(){

            if(size == 0) {
                System.out.println("queue is empty !");
            }else{
                for(int i = f ; i <= r ; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // object of queueA
        queueA q = new queueA() ;
        q.display();
        q.add(2);
        q.add(5);
        q.add(8);
        q.add(4);
        q.display();
        
    }
}
