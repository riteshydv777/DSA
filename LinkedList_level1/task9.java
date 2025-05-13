// get particular element from linkedlist

import java.util.*;
public class task9 {

    // create node class
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
        void insertAtend(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
            }else{
                tail.next = temp ;
            }
            tail = temp ;
        }

        // get element at given index
        int getElement(int idx){
            if(idx < 0 ){
                 return -1 ;
            }else{
                Node temp = head ;
                for(int i = 0 ; i < idx ; i++){
                    temp = temp.next ;
                }
                return temp.data ;
            }
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
        linkedlist ll = new linkedlist();

        // insert data
        ll.insertAtend(2);
        ll.insertAtend(5);
        ll.insertAtend(8);
        ll.insertAtend(6);
        ll.insertAtend(4);

        System.out.println("linkedlist is :");
        ll.display();

        System.out.println();
         System.out.println(ll.getElement(2));


    }
}
