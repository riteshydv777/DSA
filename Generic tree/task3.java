// Generic tree
// Height of generic tree

import java.util.*;
public class task3 {

    // Height of generic tree
    public static int height(Node node){
        int ht = -1 ;
        for(Node child : node.children){
            int childheight = height(child);
            ht = Math.max(childheight,ht);
        }
        ht = ht + 1 ;
        return ht ;
    }

    // create display()
    public static void display(Node node){
        String str = node.data+"-->" ;
        for(Node child : node.children){
            str = str + child.data+","; 
        }
        str = str +"." ;
        System.out.println(str);

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
        // construct generic tree
        int[]arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};
        
        Node root = null ;
        // create stack
        Stack<Node> st = new Stack<>();

        // traverse array element
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

        // height of generic tree
        System.out.println(height(root));

    }
}
