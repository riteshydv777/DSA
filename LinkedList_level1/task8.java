// create linkedlist 
// insert at end of linkedlist
// insert at begining of linkedlist
// display linkedlist
// size of linkedlist

import java.util.*;

public class task8 {

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

        // insert at end ....(1)
        void insertAtend(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
            }else{
                tail.next = temp ;
            }
            tail = temp ;
        }

        // insert at begining...(2)
        void insertAtBegining(int val){
            Node temp = new Node(val);
            // for empty list
            if(head == null){
                head = tail = temp ;
            }else{
                temp.next = head ;
            }
            head = temp ;
        }

        // insert at any index...
        void insertAtanyIndex(int idx , int val){
            Node t = new Node(val);
            // temp for traverse
            Node temp = head ;
            for(int i = 0 ; i < idx - 1 ; i++){
                temp = temp.next ;
            }
            t.next = temp.next ;
            temp.next = t ;
        }

        // display()...
            void display(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
        }

    }
    public static void main(String[] args) {
        // create object of linkedlist class
        linkedlist ll = new linkedlist() ;

        // insert at end of linkedlist
        ll.insertAtend(2);
        ll.insertAtend(5);
        ll.insertAtend(8);
        ll.insertAtend(6);
       

        // display linkedlist
        System.out.println("linkedlist is :");
        ll.display();

        // insert at beginging of linkedlist...
        ll.insertAtBegining(9);
        ll.insertAtBegining(7);

        System.out.println("\n"+"linkedlist is :");
        ll.display();

        // insert at any index 
        ll.insertAtanyIndex(2, 25);

        // dis
        System.out.println("\n"+"linkedlist is :");
        ll.display();


    }
}
