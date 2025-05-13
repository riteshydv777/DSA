// LinkedList implementation of queue

import java.util.*;

public class LLImplementation {
    // create Node class
    public static class Node{
        int val ;
        Node next ;
        // constructor
        Node(int val){
            this.val = val ;
        }
    }
    // creating class
    public static class queueLL{
        Node head = null ;
        Node tail = null ;
        int size = 0 ;

        // ...add()...
        public void add(int x){
            Node temp = new Node(x) ;
            if(size == 0){
                head = tail = temp ;
            }
            else{
                tail.next = temp ;
                tail = temp ;
            }
            size++ ;
        }

        // ...peek()...
        public int peek(){
            if(size == 0){
                System.out.println("empty !");
                return -1 ;
            }
            return head.val ;
        }

        // ...remove()...
        public int remove(){
            if(size == 0){
                System.out.println("empty !");
                return -1 ;
            }
            int x = head.val ;
            head = head.next ;
            size-- ;
            return x ;
        }

        // ...display()...
        public void display(){
            if(size == 0){
                System.out.println("empty !");
            }
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next ;
            }
            System.out.println();
        }
    }    
  
    public static void main(String[] args) {
       // object of queueLL
       queueLL q1 = new queueLL();
       
       q1.display();
       q1.add(2);
       q1.add(25);
       q1.add(4);
       q1.add(7);
       q1.display();

       int p = q1.peek();
       System.out.println(p);

       System.out.println(q1.size);

       int r = q1.remove();
       System.out.println(r); 
    }
}
