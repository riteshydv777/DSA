// insert at end of linkedlist
// insert at beginig of linkedlist
// display linkedlist
// size of linkedlist

import java.util.*;
public class task6 {

    // create Node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
        }
    }

    // create linkedlist class
    public static class linkedlist{
        Node head = null ;
        Node tail = null ;

        // insert at end of linkedlist
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
            }else{
                tail.next = temp ;
            }
            tail = temp ;
        }

        // insert at begining
        void insertAtBegining(int val){
            Node temp = new Node(val);
            // empty list
            if(head == null){
                head = tail = temp ;
            }else{
                temp.next = head ;
            }
            head = temp ;
        }

        // display
        void display(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
        }

        //size
        int size(){
            Node temp = head ;
            int count = 0 ;
            while(temp != null){
                count++ ;
                temp = temp.next ;
            }
            return count ;
        }


    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        // insert at end of linkedlist
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(5);

        // display()...
        System.out.println("linkedlist is : ");
        ll.display();
        System.out.println("\n"+"size of linkedlist is :" +ll.size());

        // insert at begining
        ll.insertAtBegining(9);
        ll.insertAtBegining(7);
        System.out.println("linkedlist is :");
        ll.display();
         
    }
}
