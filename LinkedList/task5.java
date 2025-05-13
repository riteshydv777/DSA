// insert data at any index in linked list .

import java.util.*;
public class task5 {
    // create Node class.
    public static class Node{
        int data ;
        Node next ;
        //create constructor.
        Node(int data){
            this.data = data ;
        }
    }

    public static class linkedlist{
        Node head = null ;
        Node tail = null ;

        // method for add data to linkedlist.
        void add(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
            }else{
                tail.next = temp ;
            }
            tail = temp ;
        }

        // method for insert at index.
        void insertAtindx(int indx , int val){
            // node for inserted val
            Node t = new Node(val);
            // node for traverse the list.
            Node temp = head ; 
            for(int i = 0 ; i < indx - 1 ; i++){
                temp = temp.next ;
            }
            t.next = temp.next ;
            temp.next = t ;
        }

        // display method
        void disply(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
        }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(2);
        ll.add(5);
        ll.add(8);
        System.out.println("your linked list is : ");
        ll.disply();
        System.out.println("\n"+"after inserting data linkedlist is : ");
        ll.insertAtindx(2, 7);
        ll.disply();
    }
}
