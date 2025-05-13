// level order linewise in generic tree

import java.util.*;
public class task6 {
    // level order linewise in generic tree
    public static void levellinewise(Node node){
        // create main queue
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node) ;
        // create child queue
        Queue<Node> cq = new ArrayDeque<>();

        while(mq.size() > 0){
            // remove , print , add
            node = mq.remove();
            System.out.print(node.data+" ");
            for(Node child : node.children){
                cq.add(child);
            }
            if(mq.size() == 0){
                mq = cq ;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }

    }

    // display generic tree
    public static void display(Node node){
        String str = node.data+ "-->" ;
        for(Node child : node.children){
            str = str + child.data+"," ;
        }

    }
    // create Node datatype
    private static class Node{
        int data ;
        ArrayList<Node> children = new ArrayList<>() ;
    }

    public static void main(String[] args) {
        // construct generic tree
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};

        Node root = null ;
        // create stack
        Stack<Node> st = new Stack<>();

        // put element in stack
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
                st.push(t) ;
            }
        }
        // display generic tree
        display(root);

        // linewise
        levellinewise(root);

    }
}
