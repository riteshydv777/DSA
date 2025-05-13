// Binart Tree
import java.util.*;

public class task1 {

    // display
    public static void display(Node node){
        // base case
        if(node == null){
            return ;
        }

        String str = " " ;

        str+= node.left == null ?"." : node.left.data ;
        str+= "<--"+node.data+"-->" ;
        str+= node.right == null ?"." : node.right.data ;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    // create Node datatye
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
    // create Pair
    public static class Pair{
        Node node ;
        int state ;
        // constructor
        Pair(Node node , int state){
            this.node = node ;
            this.state = state ;
        }
    }
    // preorder traversal
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // construct binary tree
        Integer [] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node root = new Node(arr[0] , null , null);

        Pair rtp = new Pair(root , 1);

        // create stack
        Stack<Pair> st = new Stack<>();
        st.push(rtp) ;

        int idx = 0 ;
        while(st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                idx++ ;
                if(arr[idx] != null){
                    top.node.left = new Node(arr[idx],null,null);
                    Pair lp = new Pair(top.node.left,1) ;
                    st.push(lp) ;
                }else {
                    top.node.left = null;
                }
                top.state++ ;
            }else if(top.state == 2){
                idx++ ; 
                if(arr[idx] != null){
                    top.node.right = new Node(arr[idx] , null , null);
                    Pair rp = new Pair(top.node.right,1);
                    st.push(rp);
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

        preorder(root);

    }
}
