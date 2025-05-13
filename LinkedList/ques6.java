// deleting the middle element of the linkedlist.

import java.util.*;
public class ques6{
    // create Node class
    public static class Node{
        int data;
        Node next;
        //create constructor
        Node(int data){
            this.data = data ;
        }
    }
    // deleting middle element
    public static Node deleteMiddleElement(Node head){
        // for single Node
        if(head.next == null){
            return null ;
        }
        Node slow = head ;
        Node fast = head ;
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        slow.next = slow.next.next ;
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
    // length methode
    public static int length(Node head){
        Node temp = head ;
        int count = 0 ;
        while(temp != null){
            temp = temp.next; 
            count++ ;
        }
        return count ;
    }
    public static void main(String[] args) {
        // create object of Nodes
        Node a = new Node(1);
        Node b = new Node(5);
        Node c = new Node(10);
        Node d = new Node(13);
        Node e = new Node(12);
        Node f = new Node(4);
        // link Nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;

        System.out.println("your linked list is : ");
        display(a);
        System.out.println("\n"+"length of list is : "+length(a));
        System.out.println();
        deleteMiddleElement(a);
        System.out.println("your new linked list is : ");
        display(a);
        System.out.println("\n"+"length of list is : "+length(a));


    }
}
