// detect cycle in linkedlist...

import java.util.*;
public class task7 {
    // creating Node class
    public static class Node{
        int data ;
         Node next ;
         // create constructor
         Node(int data){
            this.data = data ;
         }  
    }
     // display method
     public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp  =temp.next ;
        }
     }

     // methode to detect cycle in list
     public static boolean hasCycle(Node head){ 

        // for single node and for empty list
        if(head == null)return false ;
        if(head.next == null) return false ;

        Node slow = head ; 
        Node fast = head ;
        while(head != null){

            slow = slow.next ;
            if(slow.next == null) return false ;
            fast = fast.next.next ;
            if(fast.next == null) return false ;
            if(fast == slow) return true ;
        }
        return false ;
     }
    public static void main(String[] args) {
        // create object of Node 
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        // link data
        a.next = b ; 
        b.next = c ; 
        c.next = d ;
        d.next = b ;

        //display(a);
         System.out.println(hasCycle(a));
        
    }
}
