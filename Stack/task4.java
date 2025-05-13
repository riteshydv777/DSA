// display stack data

import java.util.*;
public class task4 {
    public static void main(String[] args) {
        // declare stack
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st+" --> size --> " +st.size());

        // create new stack
        // display using new stack
        System.out.println("display using new stack : ");
        Stack<Integer> rt = new Stack<>();

        while(st.size() > 0){

            rt.push(st.pop());

            //rt.push(st.peek());
            //st.pop();
        }

        //System.out.println(rt);

        while(rt.size() > 0){

            int x = rt.pop();

            // int x = rt.peek();
            // rt.pop();

            System.out.print(x+" ");
            st.push(x);
        }

        // display using array
        System.out.println("\n"+"display using array : ");
        int n = st.size();
        int[]arr = new int[n];

        for(int i = n-1 ; i >= 0 ; i--){
            arr[i] = st.pop();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
