// Generic tree
// Traversal in Generic tree

import java.util.*;
public class task4 {

    // Traversal in Generic tree
    public static void traversal(Node node){
        // eular's left , on the way deep in the recursion , node's pre area.
        System.out.println("Node pre "+node.data);
        // on the way to child
        for(Node child : node.children){
            // edge pre
            System.out.println("edge pre " +node.data+"--"+child.data);
            traversal(child);
            // edge post
            System.out.println("edge post " +node.data+"--"+child.data);
        }
        // eular's right , on the way out of recursion , node's post area.
        System.out.println("Node post "+node.data);
    }

    // create display()
    public static void display(Node node){
        String str = node.data+"-->" ;
        // traverse node's child
        for(Node child : node.children){
            str = str + child.data + "," ;
        }
        str = str + "." ;
        System.out.println(str); // 10 --> 20,30,40,.
        // recursive call
        for(Node child : node.children){
            display(child);
        }
    }

    // create Node datatype
    private static class Node{
        int data ;
        ArrayList<Node> children = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        // construct Generic tree
        int[]arr = {10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};

        Node root = null ;
        // create stack
        Stack<Node> st = new Stack<>();

        // travese array element
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == -1){
                st.pop();
            }else{
                Node t = new Node();
                t.data = arr[i] ;
                if(st.size() > 0){
                    st.peek().children.add(t) ;
                }else{
                    root = t ;
                }
                st.push(t) ;
            }
        }

        // display your generic tree
        display(root);
        // traversal in generic tree
        traversal(root);
    }
}
