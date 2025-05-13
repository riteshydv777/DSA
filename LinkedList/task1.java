// LinkedList  

import java.util.*;

public class task1{
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
        }
    }
     public static void main(String[]args){
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(3);
        Node d = new Node(16);
        Node e = new Node(25);

        //link
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        // displaying linkedlist.
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);

        System.out.println(a.next.data);
        System.out.println(b.next.data);
        System.out.println(c.next.data);
        System.out.println(d.next.data);
        System.out.println(e.next.data);

    }
 }
 