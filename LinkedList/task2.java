// display a LinkedList.

import java.util.*;
public class task2 {
    // create Noode class.
    public static class Node{
        int data;
        Node next;

        // create constructor.

        Node(int data){
            this.data = data;
        }
    }
     // display function
     public static void display(Node head){
        Node temp = head ;
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void displayrecursive(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        displayrecursive(head.next);
    }

    public static void displayreverse(Node head){
        if(head == null){
            return;
        }
        displayreverse(head.next);
        System.out.print(head.data+" ");
    }

    public static void main(String[]args){

//'''''' object of class Node with constructor'''''''

        Node a = new Node(7);
        Node b = new Node(4);
        Node c = new Node(22);
        Node d = new Node(25);

        // link a --> b --> c --> d --> d 
        a.next = b ;
        b.next = c ;
        c.next = d ;
    
    // display 
    
    // System.out.println(a.data);
    // System.out.println(b.data);
    // System.out.println(c.data);
    // System.out.println(d.data);

    //'''''' display linked list using for loop.''''''

    // System.out.println("linkedlist using for loop : ");

    // Node temp = a ;
    // for(int i = 1 ; i <= 4 ; i++){
    //     System.out.println(temp.data);
    //     temp = temp.next ;
    // }

    //'''''' display linked list using while loop.''''''

    // System.out.println("linked list using while loop : ");

    // Node var = a ;
    //  while(var != null){
    //     System.out.println(var.data);
    //     var = var.next ;
    //  }

     // display using function
     System.out.println("linkedlist using display function : ");
     display(a);
     
     System.out.println("\n"+"your linledlist using recursion : ");
     displayrecursive(a);

     System.out.println("\n"+"your reversed linked list is : ");
     displayreverse(a);


   // object of class Node without constructor.     
        // Node a = new Node();
        // a.data = 5 ;
        // Node b = new Node();
        // b.data = 7;
        // Node c = new Node();
        // c.data = 9;
        // Link 
        // a.next = b ;
        // b.next = c ;
        // // display
        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
    }
}
