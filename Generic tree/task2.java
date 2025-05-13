// Generic tree 
// display , size , maximum

import java.util.*;
public class task2 {

    // create max() to find maximum of tree
    public static int max(Node node){
        int max = Integer.MIN_VALUE;
        for(Node child : node.children){
            int cm = max(child);
            max = Math.max(cm,max);
        }
        max = Math.max(node.data , max);
        return max ;
    }

    // create size() to get the size of tree
    public static int size(Node node){
        int s = 0 ;
        for(Node child : node.children){
            int cs = size(child);
            s = s + cs ;
        }
        s = s + 1 ;
        return s ;
    }
    // create display() to display generic tree
    public static void display(Node node){
        String str = node.data+"-->" ;
        // traverse node's child         
        for(Node child : node.children){
            str = str + child.data+"," ;
        }
        str = str+".";
        System.out.println(str); // 10 --> 20,30,40,.

        // again travers node's children 
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

        // construct a generic tree
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};

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

        // size of your generic tree
        System.out.println(size(root));

        // maximum in your generic tree
        System.out.println(max(root));


    }
}
