// dectect cycle in linkedlist

import java.util.*;
public class task10 {

    // create Node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    // detect cycle in given linkedlist
    public static boolean hasCycle(Node head){
        // for empty node
        if(head == null) return false ;
        // for single node
        if(head.next == null) return false ;

        Node slow = head ;
        Node fast = head ;

        while(head != null){
            slow = slow.next ;
            if(slow.next == null) return false ;
            fast = fast.next.next ;
            if(fast.next == null) return false ;
            if(slow == fast) return true ;
        }
        return false ;
    }

    // display linkedlist
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }

    public static void main(String[] args) {
        
        // assign data to node
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(4);
        Node e = new Node(6);
        // link nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = c ;

        // // display linkedlist
        // System.out.println("your linkedlist is : ");
        // display(a);

        // detect cycle in given linkedlist...
         System.out.println("detect cycle : "+hasCycle(a));
    }
}
