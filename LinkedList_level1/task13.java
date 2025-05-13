// find cycle node...

import java.util.*;
public class task13 {

    // create node class
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    // findCycleNode()...
    public static Node findCycleNode(Node head){
        Node slow = head ;
        Node fast = head ;
        // part1...
        while(fast != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast) break ;
        }
        // paart2...
        Node temp = head ;
        while(temp != slow){
            temp = temp.next ;
            slow = slow.next ;
        }
        return slow ;
    }


    // display()...
    public static void display(Node head){
        Node temp = head; 
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }


    public static void main(String[] args) {
        
        // assign nodes
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        // links nodes
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = b ;
        
        // display()...
        // System.out.println("linkedlist is : ");
        // display(a);

        // findCycleNode()...
        System.out.println("cycle node is : ");
        Node ans = findCycleNode(a);
        System.out.println(ans.data);

    }
}
