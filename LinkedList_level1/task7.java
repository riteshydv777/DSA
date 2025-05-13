// insert at end of linkedlist
// insert at any index of linkedlist

import java.util.*;
public class task7 {
    
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    // create linkedlist class
    public static class linkedlist{
        Node head = null ;
        Node tail = null ;

        // insertAtEnd
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
            }else{
                tail.next = temp ;
            }
            tail = temp ;
        }

        // insertAtAnyIndex
        void inserAtAnyIndex(int idx , int val){
            Node t = new Node(val);
            // node for traverse
            Node temp = head ;

            for(int i = 0 ; i < idx - 1 ; i++){
                temp = temp.next ;
            }

            t.next = temp.next ;
            temp.next = t ;
            
        }

        // display
        void display(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
        }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        // insertAt end
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(6);
        ll.insertAtEnd(0);

        System.out.println("linkedlist is :");
        ll.display();

        ll.inserAtAnyIndex(2, 25);
        System.out.println("\n"+"linkedlist is :");
        ll.display();

    }    
}
