// stack 

import java.util.*;
public class ques29 {
    public static void main(String[]args){
        
        // declare stack.
        Stack<Integer>st = new Stack<>() ;

        st.push(10) ; 
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());

        st.push(20) ;
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());
        st.push(30) ;
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());
        st.push(40) ;
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());
        st.push(50) ;
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());

        st.pop() ; 
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());
        st.pop() ;
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());
        st.pop() ;
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());
        st.pop() ;
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());
        st.pop() ;
        System.out.println(st+ "--> " +st.peek()+ " and size of stack is " +st.size());
    }
}
