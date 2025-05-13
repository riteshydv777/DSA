// copy contents of stack to another in same order

import java.util.*;
public class task2 {
    public static void main(String[] args) {
        // declare stack
        Stack<Integer>st = new Stack<>();
        
        // element in stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        //System.out.println(st.peek());

        System.out.print("your stack st : "+st+" ");
        //System.out.println("\n"+"length of stack is : "+st.size());

        // declare another stack
        Stack<Integer> gt = new Stack<>();
        Stack<Integer> rt = new Stack<>();

        while(st.size() > 0){
            gt.push(st.peek());
            st.pop();
        }
        System.out.print("\n"+"your stack gt : "+gt+" ");

        while(gt.size() > 0){
            rt.push(gt.peek());
            gt.pop();
        }
        System.out.println("\n"+"your stack rt : "+rt+" ");
    }
}
