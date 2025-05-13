// Previous Smaller Element
// arr =  5  2 4 6 3 5
// ans = -1 -1 2 4 2 3

import java.util.*;
public class task18 {
     // display
     public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr = {5,2,4,6,3,5} ;
        int n = arr.length ;

        int[]ans = new int[n] ;

        // declare a Stack
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        ans[0] = -1 ;

        // Logic
        for(int i = 1 ; i <= n-1 ; i++){
            
            // pop()
            while(st.size() > 0 && st.peek() >= arr[i]){
                st.pop();
            }
            // ans
            if(st.size() == 0){
                ans[i] = -1 ;
            }else{
                ans[i] = st.peek();
            }
            // push()
            st.push(arr[i]) ;
        }
         // display
         display(arr);
         display(ans);
    }
}
