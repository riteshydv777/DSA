// size of binary tree

import java.util.*;
public class task3 {

    // create Node datatype
    public static class Node{
        int data ;
        Node left ;
        Node right ;
        Node(int data , Node left , Node right){
            this.data = data ;
            this.left = left ;
            this.right = right ;
        }
    }
    // create pair datatype having node and state
    public static class Pair{
        Node node ;
        int state ;
        Pair(Node node , int state){
            this.node = node ;
            this.state = state ;
        }
    }
    // display Binary tree
    public static void display(Node node){
        // Base case
        if(node == null) return ;
        String str = " " ;
        str += node.left == null ? "." : node.left.data+" " ;
        str += "<--"+node.data+"-->" ;
        str += node.right == null ? "." : node.right.data+" " ;
        System.out.println(str);

        display(node.left);
        display(node.right);

    }
    // size of binary tree
    public static int size(Node node){
        // base case
        if(node == null) return 0 ;
        int ls = size(node.left) ;
        int rs = size(node.right) ;
        int ts = ls + rs + 1 ;
        return ts ;
    }

    public static void main(String[] args) {
        // construct Binary tree
        Integer [] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null} ;

        // create root node
        Node root = new Node(arr[0], null, null) ;
        Pair rp = new Pair(root, 1) ;
        // create stack 
        Stack<Pair> st = new Stack<>() ;
        st.push(rp) ;

        int idx = 0 ;
        while(st.size() > 0){
            Pair top = st.peek() ;
            if(top.state == 1){
                idx++ ;
                if(arr[idx] != null){
                    top.node.left = new Node(arr[idx] , null , null) ;
                    Pair lp = new Pair(top.node.left , 1) ;
                    st.push(lp) ;
                }else{
                    top.node.left = null ;
                }
                top.state++ ;
            }else if(top.state == 2){
                idx++ ;
                if(arr[idx] != null){
                    top.node.right = new Node(arr[idx] , null , null) ;
                    Pair rtp = new Pair(top.node.right , 1) ;
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
        display(root) ;
        // size of your binary tree
        System.out.println(size(root));
    }

}
