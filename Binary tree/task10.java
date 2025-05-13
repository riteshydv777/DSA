// Binary tree
// Print nodes k level far
import java.util.*;
public class task10 {
    
    // create Node datatype
    public static class Node{
        int data ;
        Node left ;
        Node right ;
        Node(int data,Node left,Node right){
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
    // display binary tree
    public static void display(Node node){
        // base case
        if(node == null){
            return; 
        }
        String str = " " ;
        str += node.left == null ? "." : node.left.data+ " " ;
        str += "<--" +node.data+ "-->" ;
        str += node.right == null ? "." : node.right.data+ " " ;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    // Print nodes k level far
    public static void PrintKnodeFar(Node node,int data,int k){
        ArrayList<Node> path = find_ntr(node,data);

    }

    // find_ntr() -- path from node to root
    static ArrayList<Integer> path ;
    public static Node find_ntr(Node node , int data){
      
    } 

    public static void main(String[] args) {
        // construct Binary tree
        Integer[]arr =  {50,25,12,null,null,37,null,null,75,62,null,null,87,null,null};
        // declare root node
        Node root = new Node(arr[0], null,null);
        Pair rp = new Pair(root, 1);

        // declare stack
        Stack<Pair> st = new Stack<>();
        st.push(rp);

        int idx = 0 ;
        while(st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                idx++ ;
                if(arr[idx] != null){
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }else{
                    top.node.left = null ;
                }
                top.state++ ;
            }else if(top.state == 2){
                idx++ ;
                if(arr[idx] != null){
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rtp = new Pair(top.node.right, 1);
                    st.push(rtp);
                }else{
                    top.node.right = null ;
                }
                top.state++ ;
            }else{
                st.pop();
            }
        }
        // display
        display(root);
        
    }
}
