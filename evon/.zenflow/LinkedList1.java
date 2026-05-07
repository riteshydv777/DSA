// linkedlist
// create linkedlist manually....

import java.util.*;
public class LinkedList1{
    // create node
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        
        // assign data to node
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(4);

        // link nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;

        // display...
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);


    }
}