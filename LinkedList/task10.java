// merge two sorted linkedlist without extra space .
import java.util.*;
public class task10 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // constructer
        Node(int data){
            this.data = data ;
        }
    }
    // merge list
    public static Node mergeList(Node head1 , Node head2){
        Node temp1 = head1 ;
        Node temp2 = head2 ;

        Node head = new Node(100);
        Node temp = head ;

        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                temp.next = temp1 ;
                temp = temp.next ;
                temp1 = temp1.next ;
            }else{
                temp.next = temp2 ;
                temp = temp.next ;
                temp2 = temp2.next ;
            }
            if(temp2 == null){
                temp.next = temp1 ;
            }else{
                temp.next = temp2 ;
            }
        }

        return head.next ;
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
        // create object od Node class
        // linkedlist : 1
        Node a1 = new Node(1); 
        Node a2 = new Node(3);
        Node a3 = new Node(5);
        Node a4 = new Node(8);
        Node a5 = new Node(9);
        // link Nodes
        a1.next = a2 ;
        a2.next = a3 ;
        a3.next = a4 ;
        a4.next = a5 ;

        // LinkedLit : 2
        Node b1 = new Node(2);
        Node b2 = new Node(4);
        Node b3 = new Node(6);
        Node b4 = new Node(7);
        // link Nodes
        b1.next = b2 ;
        b2.next = b3 ;
        b3.next = b4 ;

        System.out.println("LinkedList 1 : ");
        display(a1);
        System.out.println("\n"+"Linked list 2 : ");
        display(b1);

        System.out.println("\n"+"merged linkedlist is : ");
        Node ans = mergeList(a1, b1);
        display(ans);

    }
}
