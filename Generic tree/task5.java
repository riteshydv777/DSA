// Generic tree
// level order traversal 

import java.util.*;
public class task5 {

    // level order traversal
    public static void levelorde(Node node){
        // Queue
        Queue<Node> q = new ArrayDeque<>();
        q.add(node) ;
        while(q.size() > 0){
            // remove , print , add
            node = q.remove();
            System.out.print(node.data+" ");
            for(Node child : node.children){
                q.add(child) ;
            }
        }
        System.out.println(".");
    }

    // size of generic tree
    public static int size(Node node){
        int s = 0 ;
        for(Node child : node.children){
            int cs = size(child); 
            s = s + cs ;
        }
        s = s + 1 ;
        return s ;
    }

    // display your generic tree
    public static void display(Node node){
        String str = node.data+ "-->" ;
        for(Node child : node.children){
            str = str + child.data+ "," ;
        }
        str = str + "." ;
        System.out.println(str);  // 10 --> 20 , 30 , 40 , .
        // recursive call
        for(Node child : node.children){
            display(child);            
        }
    }

    // create node datatype
    private static class Node{
        int data ;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        // construct generic tree
        int[]arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};

        Node root = null ;
        // create stack
        Stack<Node> st = new Stack<>();
        // put element of array inside stack
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == -1){
                st.pop();
            }else{
                Node t = new Node();
                t.data = arr[i] ;
                if(st.size() > 0){
                    st.peek().children.add(t);
                }else{
                    root = t ;
                }
                st.push(t);
            }
        }

        // display your generic tree
        display(root);
        // size of generic tree
        System.out.println(size(root));
        // levelorder
        levelorde(root);
    }
}
