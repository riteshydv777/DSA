// Merge two sorted linked list.
// using extra space.

import java.util.*;
public class ques9 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // create constructor
        Node(int data){
            this.data = data ;
        }
    }
    // display 
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }
    // merge two sorted linked list.
    public static Node mergeList(Node head1 , Node head2){
        Node temp1 = head1 ;
        Node temp2 = head2 ;
        // ans Node
        Node head = new Node(100);
        Node temp = head ;

        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                Node a = new Node(temp1.data);
                temp.next = a ;
                temp = a ;
                temp1 = temp1.next ;
            }else{
                Node a = new Node(temp2.data) ;
                temp.next = a ;
                temp = a ;
                temp2 = temp2.next ; 
            }
        }
        if(temp1 == null){
            temp.next = temp2 ;
        }else{
            temp.next = temp1 ;
        }
        return head.next ;
    }

    public static void main(String[] args) {
        // create object of Node class

        // List 1 :
        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(5);
        Node a4 = new Node(8);
        Node a5 = new Node(9);
        // link list 1 :
        a1.next = a2 ;  // a1 --> a2
        a2.next = a3 ;  // a1 --> a2 --> a3
        a3.next = a4 ;  // a1 --> a2 --> a3 --> a4
        a4.next = a5 ;  // a1 --> a2 --> a3 --> a4 --> a5

        // List 2 :

        Node b1 = new Node(2);
        Node b2 = new Node(4);
        Node b3 = new Node(6);
        Node b4 = new Node(7);
        // linke list 2 :
        b1.next = b2 ;  // b1 --> b2
        b2.next = b3 ;  // b1 --> b2 --> b3
        b3.next = b4 ;  // b1 --> b2 --> b3 --> b4

        System.out.println("Linked list 1 : ");
        display(a1);
        System.out.println("\n"+"Linked list 2 : ");
        display(b1);

        System.out.println("\n"+"merge linked list is : ");
        Node ans = mergeList(a1, b1) ;
        display(ans);
        
    }
}
