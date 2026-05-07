
// display a linkedlist
// length of a linkedlist

import java.util.*;

public class LinkedList2 {

    // create Node..................................................
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    // length()...................................................
    public static int length(Node head){
        int count = 0 ;
        while(head != null){
            count++ ;
            head = head.next ;
        }
        return count ;
    }

    // displayReverse()............................................
    public static void displayReverse(Node head){
        // edge case
        if(head == null) return ;
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }

    // displayRecursively()........................................
    public static void displayRecursively(Node head){
        // edge case
        if(head == null) return ;
        System.out.print(head.data+" ");
        displayRecursively(head.next);
    }

    // display(0) using loop.......................................
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        
        // assign data to node
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(4);

        // link nodes
        a.next = b;
        b.next = c;
        c.next = d;

        // display linkedlist....
        System.out.println("your linkedlist using while loop :");
        display(a);

        System.out.println("\n"+"your linkedlist using recursion :");
        displayRecursively(a);

        // display linkedlist in reverse....
        System.out.print("\n"+"your reverse linkedlist is : "+"\n");
        displayReverse(a);

        // length of linked list
        System.out.println("\n"+"size of linkedlist is : " +length(a));
    }
}
