// Reverse linkedlist without recursion

import java.util.*;
public class task14 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // constructor
        Node(int data){
            this.data = data ;
        }
    }
    // reverse
    public static Node reverseList(Node head){
        Node curr = head ;
        Node prev = null ;
        Node agla = null ;

        while(curr != null){
            agla = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = agla ;
        }
        return prev ;
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
        Node a1 = new Node(3);
        Node a2 = new Node(5);
        Node a3 = new Node(1);
        Node a4 = new Node(2);
        Node a5 = new Node(4);
        // link Nodes
        a1.next = a2 ;
        a2.next = a3 ;
        a3.next = a4 ;
        a4.next = a5 ;

        System.out.println("your linked list is : ");
        display(a1);
        System.out.println();

        Node ans = reverseList(a1);
        display(ans);

    }
}
