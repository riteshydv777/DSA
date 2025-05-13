// finding middle element of linkedlist

import java.util.*; 
public class ques5 {
    
    // create Node class
    public static class Node{
        int data;
        Node next;
        
        //create constructor
         Node(int data){
            this.data = data ;
        }
    }
    // middle element
    public static Node middleElement(Node head){
        Node slow = head ;
        Node fast = head ;
        // right middle
        while(fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }

    // display method
    public static void display(Node head){
        Node temp = head ;
      
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
            
        }
    }
    // length method
    public static int length(Node head){
        int count = 0 ;
        Node temp = head ;
        while(temp != null){
            temp = temp.next;
            count++ ;
        }
        return count ;
    }
    public static void main(String[] args) {
        // create object of Node 
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        //Node f = new Node(10);

        // link Nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        //e.next = f ;

        System.out.println("your linledlist is : ");
         
        display(a);
        //System.out.println("\n"+length(a));
        Node ans = middleElement(a);
        System.out.println();
        System.out.println(ans.data);
    }
}
