// merge two sorted linkedlist using extra space

import java.util.*;
public class task17 {

    // create Node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
        }
    }

    // merge two sorted linkedlist...


    // display()...
    public static void display(Node head){
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }

    public static void main(String[] args) {
        
        // create linked list(1)...
        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(5);
        Node a4 = new Node(7);
        // link nodes
        a1.next = a2 ;
        a2.next = a3 ;
        a3.next = a4 ;

        // linkedlist(2)...
        Node b1 = new Node(2);
        Node b2 = new Node(4);
        Node b3 = new Node(6);
        Node b4 = new Node(8);
        // link nodes
        b1.next = b2 ;
        b2.next = b3 ;
        b3.next = b4 ;

        System.out.println("linkedlist 1 :");
        display(a1);
        System.out.println("\n"+"linkedlist 2 :");
        display(b1);

        // merge two sorted linkedlist...

    }
}
