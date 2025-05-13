// Removing nth Node from the end of linked list  in one traversal.

import java.util.*;
public class ques3 {
    // create Node class
    public static class Node{
        int data;
        Node next ;
        // create constructor
        Node(int data){
            this.data = data ;
        }
    }
    // remove nth node from end.
    public static Node deleteNthNode(Node head , int n){
        Node slow = head ;
        Node fast = head ;
        for(int i = 1 ; i <= n ; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next ;
            return head ;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next ;
        return head ;
    }
    // display method
    public static void display(Node head){
        Node temp = head ;
        System.out.println("your list is : ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }
    public static void main(String[] args) {
        //create object of Node class
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        // link Nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;

        display(a);
        System.out.println();
        a = deleteNthNode(a, 6);
        display(a);
        
    }
}
