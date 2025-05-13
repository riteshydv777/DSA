// Binary tree
import java.util.*;
public class task2 {


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
    
    // create Node datatype
    public static class Node{
        int data ; 
        Node left ;
        Node right ;
        Node(int data){
            this.data = data ;
            this.left = left ;
            this.right = right ;
        }
    }

    // create binary tree class to create tree
    public static class BinaryTree{
        static int idx = -1 ;
        public static Node buildTree(int[]arr){
            idx++ ;
            if(arr[idx] == -1){
                return null ;
            }
            // create node for element
            Node newNode = new Node(arr[idx]);
            // create left child
             newNode.left = buildTree(arr) ;
            // create right child
            newNode.right = buildTree(arr) ;

            return newNode ;
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
        int[]arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ;

        BinaryTree tree = new BinaryTree() ;
        Node root = tree.buildTree(arr) ;
        System.out.println(root.data);

        display(root);
        preorder(root);
    }
}
