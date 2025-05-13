// finding nth Node from the end of linked list.

import java.util.*;
public class ques2 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // create constructor.
        Node(int data){
            this.data = data ;
        }
    }
    public static Node nth2Node(Node head , int n){
        Node slow = head ;
        Node fast = head ;

        for(int i = 1 ; i <= n ; i++){
            fast = fast.next ;
        }

        while(fast != null){
            slow = slow.next ;
            fast = fast.next ;
        }
        return slow ;
    }
    // nth node from end
    public static Node nthNode(Node head , int n){
        int size = 0 ;
        Node temp = head ;
        while(temp != null){
            size++ ;
            temp = temp.next ;
        }
        // mth node from start is equal to nth node from end.
        int m = size - n +1 ;
        temp = head ;
        for(int i = 1 ; i <= m-1 ; i++){
            temp = temp.next ;
        }
        return temp ;
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
    // public static void deleteNode(Node head){
    //     head.data = head.next.data ;
    //     head.next = head.next.next ;
    // }

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
        // deleteNode(c);
        // display(a);

        System.out.println(nthNode(a,2).data);
         System.out.println(nth2Node(a,3).data);
    }    
}

    

