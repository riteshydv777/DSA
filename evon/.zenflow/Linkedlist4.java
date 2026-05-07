// insert data at index

import java.util.*;
public class Linkedlist4 {

    // create node
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
        }
    }
    // create linkedlist class
    public static class LinkedList{
        Node head = null ;
        Node tail = null ;

        // insert at any index
        void insertAtIdx(int val , int idx){
            // create node for val....
            Node t = new Node(val);
            // create node for traverse
            Node temp = head;

            for(int i = 0 ; i < idx-1 ; i++){
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t ;
        }

        // insert at end / add data
        void add(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        // display
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // add element
        ll.add(2);
        ll.add(5);
        ll.add(8);
        ll.add(4);
        ll.add(6);

        System.out.println("your linkedlist is :");
        ll.display();

        ll.insertAtIdx(7, 2);
        System.out.println("\n"+"your new linkedlist is :");
        ll.display();
    }
}
