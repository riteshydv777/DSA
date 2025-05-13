// Finding intersection of two linkedlist

import java.util.*;
public class ques4 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // create constructor
        Node(int data){
            this.data = data ;
        }
    }
    // intersection Node
    public static Node intersectionNode(Node headA , Node headB){
        Node tempA = headA ;
        Node tempB = headB ;
        //find length of both list
        int lengthA = 0 ;
        while(tempA != null){
            lengthA++ ;
            tempA = tempA.next ;
        }
        int lengthB = 0 ;
        while(tempB != null){
            lengthB++ ;
            tempB = tempB.next ;
        }

        tempA = headA ;
        tempB = headB ;
        if(lengthA > lengthB){
            int steps = lengthA - lengthB ;
            for(int i = 1 ; i <= steps ; i++){
                tempA = tempA.next ;
            }
        }else{
            int steps = lengthB - lengthA ;
            for(int i = 1 ; i <= steps ; i++){
                tempB = tempB.next ;
            }
        }

        while(tempA != tempB){
            tempA = tempA.next ;
            tempB = tempB.next ;
        }

        return tempA ;
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
        // create object of Node
        Node a = new Node(87);
        Node b = new Node(100);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(12);
        Node g = new Node(10);

        Node x = new Node(90);
        Node y = new Node(9);

        // link Nodes
        // 87 --> 100 --> 13 --> 4 --> 5 --> 12 --> 10
        //                90 --> 9 -->
        a.next = b ;
        b.next = c ;
        c.next = d ; 
        d.next = e ;
        e.next = f ;
        f.next = g ;

        x.next = y ;
        y.next = e ;
        System.out.println("list 1 : ");
        display(a);
        System.out.println("\n"+"list 2 :");
        display(x);

        System.out.println("\n"+"intersection Node is : ");
        //System.out.println(intersectionNode(a,x).data);
        
         
        Node z = intersectionNode(a, x);
        System.out.println(z.data);

    }
}
