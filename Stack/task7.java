// Reverse stack

import java.util.*;
public class task7 {
    // reverse stack using recursion
    public static void reverseStack(Stack<Integer>st){
        if(st.size() == 1) return ;

        int top = st.pop() ;
        reverseStack(st);
        pushAtBottom(st,top);
        
    }
    // push at bottom
    public static void pushAtBottom(Stack<Integer>st , int x){
        if(st.size() == 0){
            st.push(x);
            return ;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
         // declare stac
         Stack<Integer>st = new Stack<>();

         st.push(1);
         st.push(2);
         st.push(3);
         st.push(4);
         st.push(5);
 
         System.out.println("stack st : "+st);

         //.......iterative solution.......
         
        //  Stack<Integer>rt = new Stack<>();
        //  while(st.size() > 0){
        //     rt.push(st.pop());
        //  }
        //  System.out.println("Stack rt : "+rt);

        //  Stack<Integer>gt = new Stack<>();
        //  while(rt.size() > 0){
        //     gt.push(rt.pop());
        //  }
        //  System.out.println("Stack gt : "+gt);

        //  while(gt.size() > 0){
        //     st.push(gt.pop());
        //  }
        //  System.out.println("Reverse stack st : "+st);

        reverseStack(st);
        System.out.println("reversed stack is : "+st);
         

    }
}
