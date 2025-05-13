// Maximum of binary tree

import java.util.*;
public class task5 {

    // create Node datatype
    public static class Node{
        int data ;
        Node left ;
        Node right ;
        // constructor
        Node(int data,Node left,Node right){
            this.data = data ;
            this.left = left ;
            this.right = right ;
        }
    }
    // Pair datatype having Node and state
    public static class Pair{
        Node node ;
        int state ;
        // constructor
        Pair(Node node,int state){
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
    // Maximum of binary tree
    public static int max(Node node){
        if(node == null) return Integer.MIN_VALUE ;

        int leftmax = max(node.left) ;
        int rightmax = max(node.right) ;
        int totalmax = Math.max(node.data,Math.max(leftmax,rightmax));
        return totalmax ;
    }

    // Height of Binary tree
    public static int height(Node node){
        if(node == null) return -1 ;

        int lh = height(node.left) ;
        int rh = height(node.right) ;
        int th = Math.max(lh,rh) + 1 ;
        return th ;
    }

    public static void main(String[] args) {
        // construct Binary tree
        Integer[]arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null} ;

        // root , node-state pair 
        Node root = new Node(arr[0],null,null);
        Pair rp = new Pair(root, 1) ;

        // create stack to store rp
        Stack<Pair> st = new Stack<>();
        st.push(rp);

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

        // display
        display(root);
        // maximum of tree
        System.out.println(max(root));
        // height of binary tree
        System.out.println(height(root));

    }
}
