// find length of linked list

import java.util.*;
public class task3 {
    // creating Node class
    public static class Node{
        int data;
        Node next;
        //create constructor
        Node(int data){
            this.data = data ; 
        }
    }

     //display function for linked list
     public static void display(Node head){
        Node temp = head ;
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    // function for finding length of linked List
    public static int length(Node head){
        int count = 0 ;
        while( head != null ){
            count++ ;
            head = head.next ;

        }
        return count ;
    }

    public static void main(String[] args) {
        // create object of class Node
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(4);
        Node e = new Node(25);
        Node f = new Node(22);
        // link data 
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;

        // display linked list
        System.out.println("your linked list is : ");
        display(a);

        // length of linkedlist
        System.out.println("\n"+"length of linked list is : ");
        int len = length(a);
        System.out.println(len);
        
    }
}
