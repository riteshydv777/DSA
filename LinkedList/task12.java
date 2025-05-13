// Rempve duplicates from a sorted linkedlist

import java.util.*;
public class task12 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // constructor
        Node(int data){
            this.data = data ;
        }
    }
    // rempve duplicates
    public static Node removeDuplicate(Node head){
        Node temp = head ;

        while(temp != null && temp.next != null){
            if(temp.next.data == temp.data){
                temp.next = temp.next.next ;
            }
            if(temp.next == null) return head ;
            if(temp.next.data != temp.data){
                temp = temp.next ;
            }
        }
        return head ;

    }
    // display method
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }
    public static void main(String[] args) {
        // object of Node class
        Node a1 = new Node(1);
        Node a2 = new Node(1);
        Node a3 = new Node(2);
        Node a4 = new Node(3);
        Node a5 = new Node(3);
        Node a6 = new Node(3);
        Node a7 = new Node(4);
        Node a8 = new Node(4);
        Node a9 = new Node(5);
        // link Nodes
        a1.next = a2 ;
        a2.next = a3 ;
        a3.next = a4 ;
        a4.next = a5 ;
        a5.next = a6 ;
        a6.next = a7 ;
        a7.next = a8 ;
        a8.next = a9 ;

        System.out.println("your linkedlist is : ");
        display(a1);
        System.out.println("\n"+"your new linkedlist is : ");
        Node ans = removeDuplicate(a1);
        display(ans);
    }
}
