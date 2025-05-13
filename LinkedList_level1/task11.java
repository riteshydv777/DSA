// dectect cycle of linkedlist

import java.util.*;
public class task11 {

    // create Node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    // detect cycle...
    public static boolean hasCycle(Node head){
        // for empty node
        if(head == null) return false ;
        // for single nole
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

    // display()...
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }

    public static void main(String[] args) {
        
        // assign data to Nodes
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8) ;
        Node d = new Node(4);
        Node e = new Node(6);
        // link nodes to each other
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = a ;
        // display()...
        // System.out.println("your linkedlist is : ");
        // display(a);

        // dectect cycle...
        System.out.println(hasCycle(a));

    }
}
