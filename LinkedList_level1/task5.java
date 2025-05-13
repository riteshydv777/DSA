// insert at end of linkedlist
// insert at beginging of linkedlist

// display linkedlist
// size of linkedlist

import java.util.*;
public class task5 {

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

        // (1). insert at end of linkedlist
        void inserAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
            }else{
                tail.next = temp ;
            }
            tail = temp ;
        }

        // (2). insert at begining of linkedlist
        void insertAtBegining(int val){
            Node temp = new Node(val);
            // empty linkedlist
            if(head == null){
                head = tail = temp ;
            }else{
                temp.next = head ;
            }
            head = temp ;
        }

        // (3). display linkedlist
        void display(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
        }

        // (4). size of linkedlist
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
        ll.inserAtEnd(2);
        ll.inserAtEnd(5);
        ll.inserAtEnd(8);
        ll.inserAtEnd(6);
        ll.inserAtEnd(4);
        ll.inserAtEnd(7);

        // display linkedlist
        System.out.println("linkedlist is :");
        ll.display();
        // size of linkedlist
        System.out.println("\n"+"linkedlist size : " +ll.size());

        // insert at begining of linkedlist
        ll.insertAtBegining(25);
        ll.insertAtBegining(70);
        ll.insertAtBegining(108);

        // display linkedlist
        System.out.println("\n"+" Now linkedlist is :");
        ll.display();

        // size of linkedlist
        System.out.println("\n"+"linkedlist size is : " +ll.size());
        
    }
}
