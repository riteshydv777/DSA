//  Next Smaller Element
//  arr[] = 5  2 4 6  3  5
//  ans[] = 2 -1 3 3 -1 -1

import java.util.*;
public class task17 {
    // display
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // declare an array
        int[]arr = {5,2,4,6,3,5} ;
        int n = arr.length ;

        int[]ans = new int[n] ;

        // declare a Stack
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = -1 ;

        // Logic
        for(int i = n-2 ; i >= 0 ; i--){
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
