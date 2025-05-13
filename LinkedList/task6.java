// get element method.
// delete at index method...

import java.util.*;
public class task6 {
    // create Node class
    public static class Node{
        int data ;
        Node next;
        //create constructor
        Node(int data){
            this.data = data ;
        }
    }
     
    public static class linkedlist{
        Node head = null ;
        Node tail = null ;
        int size = 0 ;

        // insert at end 
        void add(int val){
            Node temp = new Node(val);
            // for empty
            if(head == null){
                head = temp ;
            }else{
                tail.next = temp ;
            }
            tail = temp ;
            size++ ;
        }

        // get element method
        int getdata(int indx){
            if(indx < 0 || indx > size){
                System.out.println("wrong index : ");
                return -1 ;
            }
            Node temp = head ;
            for(int i = 1 ; i <= indx ; i++){
                temp = temp.next ;
            }
            return temp.data ;
        }
        // delete method
        void deleteAt(int idx){
            //for deleteing head data
            if(idx == 0 ){
                head = head.next ;
                size-- ;
                return ;
            }
            Node temp = head ;
            for(int i = 1 ; i <= idx - 1 ; i++){
                temp = temp.next ;
            }
            temp.next = temp.next.next ;
            // for deleting last index data
            if(idx == size - 1){
                tail = temp ;
            }
            size -- ;
        }

        // display linked list
        void display(){
            Node temp = head ;
            System.out.println("your linked list is : ");
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
            System.out.println("\n"+"length of list is : " +size);
        }
    }
    
         
    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.add(5);
        ll.add(25);
        ll.add(77);
        ll.add(78); 
        ll.add(48);
        ll.display();

        System.out.println("your data is at given index : "+ll.getdata(2));
        // System.out.println("tail is :"+ll.tail.data);

        // ll.deleteAt(2);
        // ll.display();
        

       // System.out.println("tail is : "+ll.tail.data);
        
    }    
}
