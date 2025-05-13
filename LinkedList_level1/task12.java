// find node where cycle beginigs....

import java.util.*;
public class task12 {

    // create Node class
    public static class Node{
        int data ; 
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    // findCycleNode()...
    public static Node findCyNode(Node head){
        Node slow =head  ;
        Node fast = head ;

        // part1....
        while(fast != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast) break ;
        }
        // part2...
        Node temp = head ;
        while(temp != slow){
            temp = temp.next ;
            slow = slow.next ;
        }
        return slow ; 


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
        
        // assign node
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(6) ;
        Node e = new Node(7) ;
        // links node 
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = c ;

        // display()...
        System.out.println("linkedlist is :");
        display(a);

        // find node...
        System.out.println("\n"+"node is : " +findCyNode(a).data);

    }
}
