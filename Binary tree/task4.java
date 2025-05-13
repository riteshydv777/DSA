// sum of nodes of binary tree

import java.util.*;
public class task4 {

    // create node datatype
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

    // Display Binary tree
    public static void display(Node node){
        // base case
        if(node == null) return ;
        String str = " " ;

        str += node.left == null ? "." : node.left.data+ " " ;
        str += "<--" +node.data+ "-->" ;
        str += node.right == null ? "." : node.right.data+ " " ;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    // sum of node's of binary tree
    public static int sum(Node node){
        // base case
        if(node == null) return 0 ;

        int lsum = sum(node.left) ;
        int rsum = sum(node.right) ;
        int tsum = lsum + rsum + node.data ;
        return tsum ;
    }

    public static void main(String[] args) {
        // construct Binary tree
        Integer[]arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null} ;

        // create root node
        Node root = new Node(arr[0], null, null) ;
        // cretae pair of node and state
        Pair rp = new Pair(root, 1) ;
        // create stack to store pair of node and state
        Stack<Pair> st = new Stack<>();
        st.push(rp) ;

        int idx = 0 ;
        while(st.size() > 0){
            Pair top = st.peek() ;  // 50
            if(top.state == 1){
                idx++ ;
                if(arr[idx] != null){
                    top.node.left = new Node(arr[idx], null , null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp) ;
                }else{
                    top.node.left = null ;
                }
                top.state++ ;  // state == 2 
            }else if(top.state == 2){
                idx++ ;
                if(arr[idx] != null){
                    top.node.right = new Node(arr[idx], null , null) ;
                    Pair rtp = new Pair(top.node.right, 1) ;
                    st.push(rtp) ;
                }else{
                    top.node.right = null ;
                }
                top.state++ ;  // state == 3
            }else{
                st.pop() ;
            }
        }

        // display
        display(root);
        // sum of node's of binary tree
        System.out.println(sum(root));
    }
}
