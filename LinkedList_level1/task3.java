// create linkedlist manually
// display linkedlist
// return size of a linkedlist
// size of linkedlist

import java.util.*;
public class task3 {

    // create Node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    // size of linkedlist
    public static int size(Node head){
        int count = 0 ;
        while(head != null){
            count++ ;
            head = head.next ;
        }
        return count ;
    }

    // displayRecursively()...using recursion
    public static void displayRecursively(Node head){
        if(head == null) return ;
        System.out.print(head.data+" ");
        display(head.next);
    }

    // display()...using function
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }


    public static void main(String[] args) {
        // create object of Node class
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(4);
        Node e = new Node(9);
        // link Nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;

        // display using while loop
        System.out.println("display using while loop :");
        Node temp = a ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }

        // display using function
        System.out.println("\n"+"display using function :");
        display(a);

        // display using recursion
        System.out.println("\n"+"display using recursion :");
        displayRecursively(a);

        // size of linkedlist
        System.out.println("\n"+"size of linkedlist is :" +size(a));

    }
}
