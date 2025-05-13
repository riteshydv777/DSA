// Next Greater Element
// using stack
import java.util.*;
public class task15 {
    public static void main(String[] args) {
        // declare array
        int[]arr = {1,3,2,1,8,6,3,4} ;
        int n = arr.length ;
        int[]ans = new int[arr.length] ;
        // declare stack
        Stack<Integer> st = new Stack<>() ;
        st.push(arr[n-1]);
        ans[n-1] = -1 ;

        for(int i = n-2 ; i >= 0 ; i--){
            // pop()
            while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop() ;
            }
            // ans
            if(st.size() == 0) ans[i] = -1 ;
            else ans[i] = st.peek() ;
            // push()
            st.push(arr[i]) ;
        }

        // display 
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // display
        for(int i = 0 ; i < n ; i++){
            System.out.print(ans[i]+" ");
        }
        
    }
}
