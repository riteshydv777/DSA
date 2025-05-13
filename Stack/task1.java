// Stacks Basics
// Stack is a inear data structure  that is used to 
// store the collection of objects.

import java.util.*;
public class task1{
    public static void main(String[] args) {
         // create stack
         Stack<Integer> st = new Stack<>();

         st.push(2);
         st.push(5);
         st.push(8);
         st.push(22);
         st.push(25);
         st.push(36);
         st.push(76);

         System.out.println("your stack is : "+st);
         System.out.println("length os stack is : "+st.size());
         System.out.println("peek data in stack is : "+st.peek());

         st.pop();
         st.pop();
         st.pop();
         st.pop();
         st.pop();
         st.pop();

         System.out.println();
         System.out.println("your stack is : "+st);
         System.out.println("length os stack is : "+st.size());
         System.out.println("peek data in stack is : "+st.peek());


        
    }
}