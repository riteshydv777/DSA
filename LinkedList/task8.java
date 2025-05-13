// Findout the node where the cycle begings.

import java.util.*;
public class task8 {
    // create Node class
    public static class Node{
        int data ;
        Node next ;
        // constructor .
        Node(int data){
            this.data = data ;
        }
    }
    // cycle Node
    public static Node cycleNode(Node head){
        Node slow = head ;
        Node fast = head ;

        while(fast != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if(fast == slow)  break ;
        }

        Node temp = head ;
        while(temp != slow){
            temp = temp.next ;
            slow = slow.next ;
        }
        return slow ; 

    }
    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        // link data
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;
        f.next = c ;

        Node ans = cycleNode(a);
        System.out.println(ans.data);

    }
}
