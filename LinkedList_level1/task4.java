// insert at end of linkedlist
// inser at begining of linkedlist

// display linked list 
// size of linkedlist

import java.util.*;
public class task4 {

    // create Node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    // create linkedlist class
    public static  class linkedlist{
        Node head = null ;
        Node tail = null ;
        
        // create methode for insert at end  --------(1)
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
            }else{
                tail.next = temp ;
            }
            tail = temp ;
        }

        // create methode for insert at begining -------(2)
        void insertAtBegining(int val){
            Node temp = new Node(val);
            // empty list --> head == tail == null
            if(head == null){
                head = tail = temp ;
            }else{
                temp.next = head ;
                head = temp ;
            }
        }

        // display
        void display(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
        }

        // size()
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

        // inser at end 
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);

        // display()...
        ll.display();

        // size()...
        System.out.println("\n"+"size of linkedlist :" +ll.size());

        // insert at begining of linkedlist
        ll.insertAtBegining(3);
        
        // insert 
        ll.display();

    }    
}
