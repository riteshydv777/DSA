// display stack data using recursion
// stack data in reverse. 

import java.util.*;
public class task5{

    // display stack data in reverse.
    public static void displayInReverse(Stack<Integer>st){
        if(st.size()==0) return ;

        int top = st.pop();
        System.out.print(top+" ");
        displayInReverse(st);
        st.push(top);
    }
    // display stack data
    public static void displayRec(Stack<Integer>st){
        if(st.size() == 0){
            return ;
        }
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args) {
        // declare stack
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("stack is : "+st);
        System.out.println("stack data : ");
        displayRec(st);
        
        System.out.println("\n"+"stack data in reverse :" );
        displayInReverse(st);

    }
}