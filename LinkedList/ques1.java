// delete a node given the node itself as parameter.

import java.util.*;
public class ques1 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // create constructor.
        Node(int data){
            this.data = data ;
        }
    }
    
    // display method.
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }

    // delete method when only one node is given
    public static void deleteNode(Node head){
        head.data = head.next.data ;
        head.next = head.next.next ;
    }

    public static void main(String[] args) {
        // creating nodes objects.
        Node a = new Node(100);
        Node b = new Node(25);
        Node c = new Node(35);
        Node d = new Node(45);
        Node e = new Node(7);

        // link the Nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        // display list
        System.out.println("your linked list is :");
        display(a);
        System.out.println();
        // delete Node value
        deleteNode(c);
        display(a);
    }    
}
