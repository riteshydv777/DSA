// Stock Span
import java.util.*;
public class task16 {
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // delare array
        int[]arr = {100,80,60,70,60,75,85} ;

        int[]span = new int[arr.length] ;
        // declare stack
        Stack<Integer> st = new Stack<>();
        st.push(0) ;
        span[0] = 1 ;

        for(int i = 1 ; i < arr.length ; i++){
            // pop()
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop() ;
            }
            // ans
            if(st.size() == 0){
                span[i] = i + 1 ;
            }else{
                span[i] = i - st.peek() ;
            }
            st.push(i) ;
        }

        // display
        display(arr);
        display(span);

    }
}
