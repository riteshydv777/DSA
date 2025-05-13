// Binary tree
// print k level

import java.util.*;
public class task9 {

    // create Node datatype
    public static class Node{
        int data ;
        Node left;
        Node right;
        // constructor
        Node(int data , Node left, Node right){
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
     // display 
     public static void display(Node node){
        // base case
        if(node == null){
            return ;
        }
        String str = " " ;
        str += node.left == null ? "." : node.left.data+" " ;
        str += "<--"+node.data+"-->" ;
        str += node.right == null ? '.' : node.right.data+" " ;
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    
    // print k level
    public static void printk(Node node , int k){
        if(node == null || k < 0){
            return ;
        }
        if(k==0){
            System.out.print(node.data+" ");
        }
        printk(node.left, k-1);
        printk(node.right, k-1);
    }
    public static void main(String[] args) {
         // construct tree
         Integer[] arr = {50,25,12,null,null,37,null,null,75,62,null,null,87,null,null};

         Node root = new Node(arr[0], null,null);
         Pair rp = new Pair(root, 1) ;
 
         // declare stack
         Stack<Pair> st = new Stack<>() ;
         st.push(rp);
 
         int idx = 0 ;
         while(st.size() > 0){
             Pair top = st.peek() ;
             if(top.state == 1){
                 idx++ ;
                 if(arr[idx] != null){
                     top.node.left = new Node(arr[idx], null , null) ;
                     Pair lp = new Pair(top.node.left, 1) ;
                     st.push(lp) ;
                 }else{
                     top.node.left = null ;
                 }
                 top.state++ ;
             }else if(top.state == 2){
                 idx++ ;
                 if(arr[idx] != null){
                     top.node.right = new Node(arr[idx], null , null) ;
                     Pair rtp = new Pair(top.node.right, 1) ;
                     st.push(rtp) ;
                 }else{
                     top.node.right = null ;
                 }
                 top.state++ ;
             }else{
                 st.pop();
             }
         }
 
         // display binary tree
         display(root);
         // print k level
         printk(root, 2);
    }
}
