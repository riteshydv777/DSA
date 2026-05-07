// Reverse a linked list

import java.util.*;
public class Linkedlist5{

    // create node
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
        }
    }

    // reverse()................................................................
    public static Node reverse(Node head){
        Node curr = head ;
        Node agla = null ;
        Node prev = null ;

        while(curr != null){
            agla = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = agla;
        }
        return prev ;
    }
    
    // display..................................................................
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        // link nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;

        System.out.println("your linked list is :");
        display(a);

        // reverse...
        System.out.println("\n"+"after reversing the linkedlist :");
        Node newHead = reverse(a);
        display(newHead);

    }
}