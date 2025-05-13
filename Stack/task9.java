// Linked list implementation of stack

import java.util.*;
public class task9 {
    // create Node class
    public static class Node{   // user defined datatype
        int data ;
        Node next ;
        // constructor
        Node(int data){
            this.data = data ;
        }
    }
    
    public static class Stack{  // user defined datastructure
        Node head = null ;
        int size = 0 ;

        // .....push().....(1)
        void push(int x){
            Node temp = new Node(x);
            temp.next = head ;
            head = temp ;
            size++ ;
        }

        // .....pop().....(2)
        int pop(){
            if(head == null){
                System.out.println("stack is empty .");
                return -1 ;
            }
            int x = head.data ;
            head = head.next ;
            size-- ;
            return x ;
        }

        // .....peek().....(3)
        int peek(){
            if(head == null){
                System.out.println("stack is empty.");
            }
            return head.data ;
        }

        // .....size().....(4)
        int size(){
            return size ;
        }

        // .....display().....
        void display(){
            displayRecursively(head);
            System.out.println();
        }
        void displayRecursively(Node head){
            if(head == null) return ;
            displayRecursively(head.next);
            System.out.print(head.data+" ");
        }

        // .....displayReverse().....
        void displayReverse(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next ;
            }
        }
    }
    public static void main(String[] args) {
        // object of stack class
        Stack st = new Stack();

        //.....push().....
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        st.display();

        //.....pop().....
        //.....peek().....
        //.....display().....
        //.....size().....
    }
}
