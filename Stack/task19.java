// Largest Rectangle in Histogram

import java.util.*;
public class task19 {

     // find next smaller element.
     public static int[] nse(int[]arr){

        int[]ans = new int[arr.length] ;

        // declare a Stack
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        ans[arr.length-1] = -1 ;

        // Logic
        for(int i = arr.length-2 ; i >= 0 ; i--){
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
        return ans ;
     }

    public static void main(String[] args) {
        // declare an array
        int[]arr = {5,2,4,6,3,5} ;
        //int n = arr.length ;

        // find next smaller element.

        int[]ans = nse(arr);
        System.out.println(ans);

        // find previous smaller element.
    }
}
