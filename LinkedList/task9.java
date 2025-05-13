// Merge two sorted linked list using extra space .

import java.util.*;
public class task9 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // constructor
        Node(int data){
            this.data = data ;
        }
    }
    // merge two sorted list using extra space
    public static Node mergeTwoList(Node head1 , Node head2){
        Node temp1 = head1 ;
        Node temp2 = head2 ;

        // create new Node
        Node head = new Node(100);
        Node temp = head ;

        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                Node a = new Node(temp1.data);
                temp.next = a ;
                temp = temp.next ;
                temp1 = temp1.next ;
            }else{
                Node a = new Node(temp2.data);
                temp.next = a ;
                temp = temp.next ;
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

    // display method
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }

    public static void main(String[] args) {
        // create object of Node class
        // linked list : 1
        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(5);
        Node a4 = new Node(8);
        // link linked list : 1 
        a1.next = a2 ;
        a2.next = a3 ;
        a3.next = a4 ;

        // Linked list : 2
        Node b1 = new Node(2);
        Node b2 = new Node(4);
        Node b3 = new Node(6);
        Node b4 = new Node(7);
        // link linked list : 2
        b1.next = b2 ;
        b2.next = b3 ;
        b3.next = b4 ;

        System.out.println("Linked List 1 : ");
        display(a1);

        System.out.println("\n"+"Linked List 2 : ");
        display(b1);

        System.out.println("\n"+"your merged linked list is : ");
        Node ans = mergeTwoList(a1, b1);
        display(ans);
        

    }
}
