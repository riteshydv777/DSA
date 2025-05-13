// find node where cycle begining...

import java.util.*;
public class task14 {

    // create Node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
        }
    }

    // find node where cycle begining..
    public static Node findCycleNode(Node head){
        Node slow = head ;
        Node fast = head ;
        // part(1)...
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next ;
            if(slow == fast)  break ;
        }

        // part(2)...
        Node temp = head ;
        while(temp != slow){
            temp = temp.next ;
            slow = slow.next ;
        }
        return slow ;
    }

    // dislay()...
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }

    public static void main(String[] args) {
        // assign data to nodes
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(4);
        Node e = new Node(9);
        // link nodes 
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = c ;

        // display()...
        //System.out.println("your linkedlist is :");
        //display(a);

        // findcycleNode()...
        System.out.println("cycle node is : " +findCycleNode(a).data);


    }
}
