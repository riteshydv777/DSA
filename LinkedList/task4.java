// Insert At End 
// LinkedList

import java.util.*;
public class task4 {
    // creat Node class.
    public static class Node{
        int data ;
        Node next ;
        // constructor
        Node(int data){
            this.data = data ;
        }
    }
    
    public static class linkedlist{

        Node head = null ;
        Node tail = null ;

        // create method for insert at end

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
            }else{
                tail.next = temp ;
            }
            tail = temp ;
        }

        // create method for insert at begning.

        void insertAtStart(int val){
            Node temp = new Node(val);
            // empty linked list
            if(head == null){
                head = tail = temp ;
            }else{
                temp.next = head ;
                head = temp ;
            }

        }

        // display method
        void display(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
        }

        // find length of linked list.
        int size(){
            Node temp = head ;
            int count = 0 ;
            if(temp != null){
                count++ ; 
                temp = temp.next ;
            }
            return count ;
        }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(7);
        ll.insertAtEnd(25);
        ll.insertAtEnd(56);
        System.out.println("your linked list : ");
        ll.display();
        //ll.length(7);
        ll.insertAtEnd(57);
        System.out.println("\n"+"linked list insert at end : ");
        ll.display();
        System.out.println("\n"+"linked list insert at begining : ");
        ll.insertAtStart(35);
        ll.display();
        
    }    
}
