// Pallindrome Linkedlist.

import java.util.*;
public class task15 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // constructor
        Node(int data){
            this.data = data ;
        }
    }
    // Pallindrome linkedlist.
    public static boolean pallindromeList(Node head){
        Node slow = head ;
        Node fast = head ; 
        // find middle Node
        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        Node temp = reverse(slow.next);
        slow.next = temp ;
        
        Node p1 = head ;
        Node p2 = slow.next ;

        while(p2 != null){
            if(p1.data != p2.data) return false ;
            p1 = p1.next ;
            p2 = p2.next ;
        }
        return true ;
    }

    // reverse 
    public static Node reverse(Node head){
        if(head.next == null) return head ; // base case

        Node newHead = reverse(head.next);  // call

        head.next.next = head ;    // interchange

        head.next = null ;

        return newHead ;

    }
    // display
    public static void display(Node head){
        if(head == null) return ;
        System.out.print(head.data+" ");  // work
        display(head.next);  // call
    }
    public static void main(String[] args) {
        // object of Node class
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(3);
        Node a5 = new Node(2);
        Node a6 = new Node(1);
        // link Nodes
        a1.next = a2 ;
        a2.next = a3 ;
        a3.next = a4 ;
        a4.next = a5 ;
        a5.next = a6 ;
        
        System.out.println("your linked list is : ");
        display(a1);

        boolean ans = pallindromeList(a1);
        System.out.println("\n"+ans);
    }
}
