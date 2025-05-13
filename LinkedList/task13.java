// Reverse a linkeddlist and return its new head
// using recursion

import java.util.*;
public class task13 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // constructor
        Node(int data){
            this.data = data;
        }
    }
    // reverse linkedlist
    public static Node reverse(Node head){

        if(head.next == null) return head ; // base case

        Node newHead = reverse(head.next);  // call  

        head.next.next = head ; // interchangr
        
        head.next = null ;
        return newHead ;
    }

    // display
    public static void display(Node head){
        if(head == null){
            return ;
        }
        System.out.print(head.data+" "); // work
        display(head.next); // call
    }

    public static void main(String[] args) {
        // object of Node class
        Node a1 = new Node(3);
        Node a2 = new Node(5);
        Node a3 = new Node(1);
        Node a4 = new Node(2);
        Node a5 = new Node(4);
        // link Nodes
        a1.next = a2 ;
        a2.next = a3 ;
        a3.next = a4 ;
        a4.next = a5 ;

        display(a1);
        System.out.println();
        a1 = reverse(a1) ;
        System.out.println("reversed linkedlist is : ");
        display(a1);

    }
}
