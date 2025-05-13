// findout the node where the cycle begins .

import java.util.*;
public class ques8 {
    // create Node class
    public static class Node{
        int data;
        Node next;
        //create constructor
        Node(int data){
            this.data = data ;
        }
    }
    // Node where cycle begins
    public static Node getNode(Node head){
        Node slow = head ;
        Node fast = head ;
        while(fast != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if(fast == slow)  break ;
        }

        Node temp =  head ;
        while(temp != slow){
            temp = temp.next ;
            slow = slow.next ;
        }
        return slow ;
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
         f.next = c ;
 
        //  System.out.println("your linked list is : ");
        //  display(a);
        //  System.out.println("\n"+length(a));
        System.out.println(getNode(a).data);
    }
}
