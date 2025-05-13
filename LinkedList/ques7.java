// check cycle in linkedlist.

import java.util.*;
public class ques7 {
    // create Node class
    public static class Node{
        int data;
        Node next;
        //create constructor
        Node(int data){
            this.data = data ;
        }
    }
    // check cycle or not
    public static boolean hasCycle(Node head){

        if(head == null)return false ;  // for empty list. 
        if(head.next == null) return false ;  // for single Node only.

        Node slow = head ;
        Node fast = head ;
        while(fast != null){ 

            if(slow == null) return false ;
            slow = slow.next ;

            if(fast.next == null) return false ;
            fast = fast.next.next ;

            if(fast == slow) return true ;
        }
        return false ;
    }
     // display method
     public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }
    // length methode
    public static int length(Node head){
        Node temp = head ;
        int count = 0 ;
        while(temp != null){
            temp = temp.next; 
            count++ ;
        }
        return count ;
    }
    public static void main(String[] args) {
        // create object of Nodes
        Node a = new Node(1);
        Node b = new Node(5);
        Node c = new Node(10);
        Node d = new Node(13);
        Node e = new Node(12);
        Node f = new Node(4);
        // link Nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;
        f.next = c ;

       // System.out.println("your linked list is : ");
       // display(a);
        System.out.println("\n"+hasCycle(a));
    }
}
