// create linkedlist manually
// display linkedlist
// size of linkedlist

import java.util.*;
public class task2 {

    // create Node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    // size()...
    public static int size(Node a){
        int count = 0 ;
        while(a != null ){
            count++ ;
            a = a.next ;
        }
        return count ;
    }

    // displayRecursively()...
    public static void displayRecursively(Node head){
        if(head == null) return ;
        System.out.print(head.data+" ");
        displayRecursively(head.next);
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
        // create object of Node class
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

        // length()...
        System.out.println("\n"+"length of linkedlist :" +size(a));
         
    }    
}
