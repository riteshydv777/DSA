// Remove from botton / any index

import java.util.*;
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declare stack
        Stack<Integer>st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("stack is : "+st);

        // remove from bottom
        Stack<Integer> rt = new Stack<>();

        System.out.println("enter index : ");
        int idx = sc.nextInt();

        while(st.size() > idx){
            rt.push(st.pop());
        }
        st.pop();

        while(rt.size() > 0){
            st.push(rt.pop());
        }

        System.out.println("new stack is : "+st);
         
    }
}
