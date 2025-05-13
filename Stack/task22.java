// display stack element in reverse using recursion

import java.util.*;
public class task22 {

    // display stack element using recursion
    public static void displayRecursively(Stack<Integer>st){
        if(st.size() == 0) return ;

        int top = st.pop();
        displayRecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }
    // displayReverseRecursively
    public static void displayReverse(Stack<Integer>st){
        if(st.size() == 0) return ;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverse(st);
        st.push(top);
    }
    public static void main(String[] args) {
        // declare stack
        Stack<Integer> st = new Stack<>();
        // take element 
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("your stack is : " +st);

        // display in reverse
        System.out.println("your stack element in reverse is : ");
        displayReverse(st);

        // display stack element 
        System.out.println("\n"+"your stack element is :");
        displayRecursively(st);

    }
}
