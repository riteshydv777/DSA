// Split linkedlist into two list such that 
// one contains odd value while other contain
// even values .

import java.util.*;
public class task11 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // constructor
        Node(int data){
            this.data = data ;
        }
    }
    // split list
    public static Node splitList(Node head){
        Node temp = head ;
        // create odd nodes
        Node o = new Node(-1);
        Node tempo = o ;
        // create even nodes
        Node e = new Node(0);
        Node tempe = e ;

        while(temp != null){
            // odd
            if(temp.data % 2 != 0){
                Node a = new Node(temp.data);
                tempo.next = a ;
                tempo = tempo.next ;
                temp = temp.next ;
                
            }else if(temp.data % 2 == 0){   // even
                Node a = new Node(temp.data);
                tempe.next = a ;
                tempe = tempe.next ;
                temp = temp.next ;
            }else{

            }
            
        }
        e = e.next ;
        o = o.next ;
        tempo.next = e ;
        
        return o ;

    }
    // display method
    public static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }
    public static void main(String[] args) {
        // create object of Node class
        Node a1 = new Node(3);
        Node a2 = new Node(5);
        Node a3 = new Node(4);
        Node a4 = new Node(1);
        Node a5 = new Node(2);
        Node a6 = new Node(8);
        Node a7 = new Node(10);
        Node a8 = new Node(13);

        // link Nodes
        a1.next = a2 ;
        a2.next = a3 ;
        a3.next = a4 ;
        a4.next = a5 ;
        a5.next = a6 ;
        a6.next = a7 ;
        a7.next = a8 ;

        display(a1);
        System.out.println();

        Node ans = splitList(a1);
        display(ans);

    }
}
