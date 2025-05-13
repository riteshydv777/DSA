// Binary tree

import java.util.*;
public class task6 {

    // create Node datatype
    public static class Node{
        int data ;
        Node left ;
        Node right ;
        // constructor
        Node(int data , Node left , Node right){
            this.data = data ;
            this.left = left ;
            this.right = right ;
        }
    }

    // create Pair datatype
    public static class Pair{
        Node node ;
        int state ;
        // constructor
        Pair(Node node , int state){
            this.node = node ;
            this.state = state ;
        }
    }

    // create display function
    public static void display(Node node){
        // base case
        if(node == null){
            return ;
        }
        String str = " " ;
        str += node.left == null ? "." : node.left.data+" " ;
        str += "<--" +node.data+ "-->" ;
        str += node.right == null ? "." : node.right.data+" " ;

        System.out.println(str);

        display(node.left);
        display(node.right);

    }

    // create traversal function
    public static void traversal(Node node){
        if(node == null) return ;

        System.out.println(node.data+"pre order");  // pre order
        traversal(node.left);

        System.out.println(node.data+"in order");  // in order
        traversal(node.right); 

        System.out.println(node.data+"post order");  // post order
    }

    public static void main(String[] args) {
        // construct Binary tree
        Integer[]arr = {50,25,12,null,null,37,null,null,75,62,null,null,87,null,null} ;
        // create root node
        Node root = new Node(arr[0], null, null) ;
        // create rootpair 
        Pair rp = new Pair(root, 1) ;
        // create stack to store rp
        Stack<Pair> st = new Stack<>();
        // put element in stack
        st.push(rp) ;
        int idx = 0 ;
        while(st.size() > 0){
            Pair top = st.peek() ;
            if(top.state == 1){
                idx++ ;
                if(arr[idx] != null){
                    top.node.left = new Node(arr[idx], null, null) ;
                    Pair lp = new Pair(top.node.left, 1) ;
                    st.push(lp) ;
                }else{
                    top.node.left = null ;
                }
                top.state++ ;
            }else if(top.state == 2){
                idx++ ;
                if(arr[idx] != null){
                    top.node.right = new Node(arr[idx], null, null) ;
                    Pair rtp = new Pair(top.node.right, 1) ;
                    st.push(rtp) ;
                }else{
                    top.node.right = null ;
                }
                top.state++ ;
            }else{
                st.pop() ;
            }
        }

        // display Binary tree
        display(root);
        // traversal
        traversal(root);
    }    
}
