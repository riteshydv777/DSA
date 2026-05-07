
// insert at start and end of linkedlist

import java.util.*;
public class Linkedlist3 {

    // create Node class
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    

    // create linkedlist class
    public static class LinkedList{
        Node head = null ;
        Node tail = null ;

        // insert at start..................................
        void insertAtStart(int val){
            Node temp = new Node(val);

            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }

    

        // insert at end....................................
        void insertAtEnd(int val){
            Node temp = new Node(val) ;

            if(head == null) {
                head = temp ;
            }else{
                tail.next = temp;
            }
            tail = temp ;
        }

        // display methode..................................
        void display(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
        }

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(7);
        ll.insertAtEnd(25);
        ll.insertAtEnd(56);
        System.out.println("your linked list : ");
        ll.display();

        ll.insertAtStart(56);
        ll.insertAtStart(99);
        System.out.println("\n"+"your linked list : ");
        ll.display();
        
        
    }
}
